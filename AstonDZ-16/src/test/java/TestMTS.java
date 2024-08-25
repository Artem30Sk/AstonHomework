import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class TestMTS {

    public static WebDriver driver;
    public static PayConnectionClass payConnectionClass;
    public static PayInternetClass payInternetClass;
    public static PayInstalmentClass payInstalmentClass;
    public static PayArrearsClass payArrearsClass;

    static final String DEFAULT_URL = "https://mts.by";

    @BeforeEach
    void setup() {
        driver = WebDriverManager.chromedriver().create();
        payConnectionClass = new PayConnectionClass(driver);
        payInternetClass = new PayInternetClass(driver);
        payInstalmentClass = new PayInstalmentClass(driver);
        payArrearsClass = new PayArrearsClass(driver);
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    private void closeCookie() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        try {
            driver.findElement(By.xpath(".//div[@class='cookie__wrapper']/*/button[text()='Принять']")).click();
        } catch (Exception e) {
        }
    }

    @Test
    void checkPlaceHolder1() {
        driver.get(DEFAULT_URL);
        closeCookie();
        assertAll(
                () -> assertEquals("Номер телефона", payConnectionClass.getPhoneConnection()),
                () -> assertEquals("Сумма", payConnectionClass.getSumConnection()),
                () -> assertEquals("E-mail для отправки чека", payConnectionClass.getEmailConnection())
        );
    }

    @Test
    void checkPlaceHolder2() {
        driver.get(DEFAULT_URL);
        closeCookie();
        driver.findElement(By.xpath(".//div[@class='pay__wrapper']//span[text()='Услуги связи']")).click();
        driver.findElement(By.xpath(".//div[@class='pay__wrapper']//p[text()='Домашний интернет']")).click();
        assertAll(
                () -> assertEquals("Номер абонента", payInternetClass.getPhoneInternet()),
                () -> assertEquals("Сумма", payInternetClass.getSumInternet()),
                () -> assertEquals("E-mail для отправки чека", payInternetClass.getEmailInternet())
        );
    }

    @Test
    void checkPlaceHolder3() {
        driver.get(DEFAULT_URL);
        closeCookie();
        driver.findElement(By.xpath(".//div[@class='pay__wrapper']//span[text()='Услуги связи']")).click();
        driver.findElement(By.xpath(".//div[@class='pay__wrapper']//p[text()='Рассрочка']")).click();
        assertAll(
                () -> assertEquals("Номер счета на 44", payInstalmentClass.getScoreInstalment()),
                () -> assertEquals("Сумма", payInstalmentClass.getSumInstalment()),
                () -> assertEquals("E-mail для отправки чека", payInstalmentClass.getEmailInstalment())
        );
    }

    @Test
    void checkPlaceHolder4() {
        driver.get(DEFAULT_URL);
        closeCookie();
        driver.findElement(By.xpath(".//div[@class='pay__wrapper']//span[text()='Услуги связи']")).click();
        driver.findElement(By.xpath(".//div[@class='pay__wrapper']//p[text()='Задолженность']")).click();
        assertAll(
                () -> assertEquals("Номер счета на 2073", payArrearsClass.getScoreArrears()),
                () -> assertEquals("Сумма", payArrearsClass.getSumArrears()),
                () -> assertEquals("E-mail для отправки чека", payArrearsClass.getEmailArrears())
        );
    }

    @Test
    void testCheckIframe() {
        driver.get(DEFAULT_URL);
        closeCookie();
        payConnectionClass.inputPhone("(29)777-77-77");
        payConnectionClass.inputSum("100");
        payConnectionClass.clickBtn();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='bepaid-iframe']")));
        String correctSum = "100";
        String correctPhone = "375297777777";
        assertAll(
                () -> assertTrue(payConnectionClass.getSumTitleText().contains(correctSum)),
                () -> assertTrue(payConnectionClass.getSumButtonText().contains(correctSum)),
                () -> assertTrue(payConnectionClass.getPhoneTitleText().contains(correctPhone)),
                () -> assertEquals("Номер карты", payConnectionClass.getCardNumberText()),
                () -> assertEquals("Срок действия", payConnectionClass.getDateOutText()),
                () -> assertEquals("CVC", payConnectionClass.getCvcCodeText()),
                () -> assertEquals("Имя держателя (как на карте)", payConnectionClass.getNameOwnerText())
        );
        for (int i = 1; i < 4; i++) {
            WebElement image = driver.findElement(By.xpath(String.format(".//div[@class='cards-brands ng-tns-c46-1']/div/img[%s]", i)));
            assertNotEquals(null, image.getAttribute("src"));
        }
        for (int i = 1; i < 3; i++) {
            WebElement image = driver.findElement(By.xpath(String.format(".//div[@class='cards-brands ng-tns-c46-1']/div/div/img[%s]", i)));
            assertNotEquals(null, image.getAttribute("src"));
        }
    }

}