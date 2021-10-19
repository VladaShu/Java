import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {
    @BeforeAll
    public static void init() {
        System.out.println("My Tests");
    }

    @Test
    public void testResult() {
        Calculator calculator = new Calculator(81, 9, '/');
        assertEquals(9, calculator.getResult());
    }
    @Test
    public void testResult2() {
        Calculator calculator = new Calculator(81, 9, '+');
        assertEquals(90, calculator.getResult());
    }

    @Test
    public void testResult3() {
        Calculator calculator = new Calculator(81, 9, '-');
        assertEquals(72, calculator.getResult());
    }

    @Test
    public void testResult4() {
        Calculator calculator = new Calculator(8, 9, '*');
        assertEquals(72, calculator.getResult());
    }


    @Test
    public void testResult5() {
        Calculator calculator = new Calculator(81, 0, '/');
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.getResult();
        });
    }

    @Test
    public void testResult6() {
        Calculator calculator = new Calculator(8, 9, '*');
        Assertions.assertAll(
                () -> Assertions.assertEquals(8, calculator.getA()),
                () -> Assertions.assertEquals(9, calculator.getB()),
                () -> Assertions.assertEquals('*', calculator.getOp()));
    }
}
