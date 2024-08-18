import org.example.Main;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class FactorialTest {



    @RepeatedTest(2)
    public void testFactorial1() {
        Main main = new Main();
        int result = main.findFactrorial(5);
        assertEquals(120, result);
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
        assumeTrue(number > 0);
        int result = main.findFactrorial(number);
        assertEquals(0, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 0, 4})
    public void testFactorial4(int number) {
        Main main = new Main();
        int result = main.findFactrorial(number);
        assertEquals(120,result);
    }
}
