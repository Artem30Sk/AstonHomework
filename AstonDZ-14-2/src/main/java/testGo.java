import org.example.Main;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class testGo {
    @Test
    public void testFactorial1() {
        Main main = new Main();
        int result = main.findFactrorial(5);
        assertEquals(120,result);
    }
    @Test
    public void testFactorial2() {
        Main main = new Main();
        int result = main.findFactrorial(0);
        assertEquals(1, result);
    }
    @Test
    public void testFactorial3() {
        Main main = new Main();
        int number = -1;
        int result = main.findFactrorial(number);
        assertEquals(0, result);
    }
}
