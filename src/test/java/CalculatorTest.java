import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.lukaswais.Calculator;

public class CalculatorTest {
    @Test
    void testAdd() {
        double result = Calculator.add(2.5, 3.7);
        Assertions.assertEquals(6.2, result, 0.0001);
    }

    @Test
    void testSubtract() {
        Assertions.fail("Test not implemented");
    }

    @Test
    void testMultiply() {
        Assertions.fail("Test not implemented");
    }

    @Test
    void testDivide() {
        Assertions.fail("Test not implemented");
    }

    /**
     * checks if the correct exception is thrown.
     */
    @Test
    void testDivideByZeroException() {
        Assertions.fail("Test not implemented");    }

    /**
     * checks if the correct error message is thrown
     */
    @Test
    void testDivideByZeroExceptionMessage() {
        Assertions.fail("Test not implemented");
    }
}