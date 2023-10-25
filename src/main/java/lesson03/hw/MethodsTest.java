package lesson03.hw;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MethodsTest {

    @Test
    public void testEvenOddNumberForEven() {
        Methods methods = new Methods();
        boolean result = methods.evenOddNumber(4);
        assertTrue(result);
    }

    @Test
    public void testEvenOddNumberForOdd() {
        Methods methods = new Methods();
        boolean result = methods.evenOddNumber(7);
        assertFalse(result);
    }

    @Test
    public void testEvenOddNumberForZero() {
        Methods methods = new Methods();
        boolean result = methods.evenOddNumber(0);
        assertTrue(result);
    }

    @Test
    public void testEvenOddNumberForNegativeEven() {
        Methods methods = new Methods();
        boolean result = methods.evenOddNumber(-6);
        assertTrue(result);
    }

    @Test
    public void testEvenOddNumberForNegativeOdd() {
        Methods methods = new Methods();
        boolean result = methods.evenOddNumber(-3);
        assertFalse(result);
    }

    @Test
    public void testNumberInIntervalForNumberInRange() {
        Methods methods = new Methods();
        boolean result = methods.numberInInterval(50);
        assertTrue(result);
    }

    @Test
    public void testNumberInIntervalForNumberBelowRange() {
        Methods methods = new Methods();
        boolean result = methods.numberInInterval(24);
        assertFalse(result);
    }

    @Test
    public void testNumberInIntervalForNumberAboveRange() {
        Methods methods = new Methods();
        boolean result = methods.numberInInterval(101);
        assertFalse(result);
    }

    @Test
    public void testNumberInIntervalForLowerBoundary() {
        Methods methods = new Methods();
        boolean result = methods.numberInInterval(25);
        assertFalse(result);
    }

    @Test
    public void testNumberInIntervalForUpperBoundary() {
        Methods methods = new Methods();
        boolean result = methods.numberInInterval(100);
        assertFalse(result);
    }
}