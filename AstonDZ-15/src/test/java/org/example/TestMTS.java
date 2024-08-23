package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class TestMTS {

    WebDriver driver;

    static final String DEFAULT_URL = "https://mts.by";

    @BeforeEach
    void setup() {
        driver = WebDriverManager.chromedriver().create();
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
    void testCheckTitleName() {
        String title = "Онлайн пополнение без комиссии";
        String testTitle = "";
        WebElement element;
        driver.get(DEFAULT_URL);
        closeCookie();
        element = driver.findElement(By.xpath(".//h2[contains(text(), 'Онлайн пополнение')]"));
        String innerText = element.getAttribute("innerHTML");
        String[] lines = innerText.split("<br>");
        testTitle += lines[0] + lines[1];
        assertEquals(title, testTitle);
    }

    @Test
    void testCheckLogo() {
        driver.get(DEFAULT_URL);
        closeCookie();
        for (int i = 1; i < 6; i++) {
            WebElement element;
            element = driver.findElement(By.xpath(String.format(".//div[@class='pay__partners']/ul/li[%s]/img", i)));
            System.out.println(element.getAttribute("src"));
            assertNotEquals(null, element.getAttribute("src"));
        }
    }

    @Test
    void testCheckLink() throws IOException {
        driver.get(DEFAULT_URL);
        closeCookie();
        String currentPage = driver.getCurrentUrl();
        driver.findElement(By.xpath(".//div[@class='pay__wrapper']/a")).click();
        String newPage = driver.getCurrentUrl();
        String truePage = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        assertNotEquals(currentPage, newPage);
        assertEquals(truePage, newPage);
    }

    @Test
    void testCheckButton() {
        driver.get(DEFAULT_URL);
        closeCookie();
        WebElement phoneInputBox;
        WebElement costInputBox;
        WebElement continueButton;
        phoneInputBox = driver.findElement(By.xpath(".//div[@class='pay__wrapper']//input[@id='connection-phone']"));
        phoneInputBox.click();
        phoneInputBox.sendKeys("(29)777-77-77");
        costInputBox = driver.findElement(By.xpath(".//div[@class='pay__wrapper']//input[@id='connection-sum']"));
        costInputBox.click();
        costInputBox.sendKeys("100");
        continueButton = driver.findElement(By.xpath(".//div[@class='pay__wrapper']//button[text()='Продолжить']"));
        continueButton.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        boolean check = false;
        try {
            driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='bepaid-iframe']")));
            check = true;
        } catch (Exception e) {
        }
        assertTrue(check);
    }
}
