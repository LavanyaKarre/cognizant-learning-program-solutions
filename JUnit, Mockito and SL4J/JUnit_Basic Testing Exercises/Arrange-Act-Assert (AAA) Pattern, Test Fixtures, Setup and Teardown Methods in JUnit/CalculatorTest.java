import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    // Setup method - runs before each test
    @Before
    public void setUp() {
        calculator = new Calculator(); // Arrange
        System.out.println("Setup done.");
    }

    // Teardown method - runs after each test
    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown done.");
    }

    @Test
    public void testAddition() {
        // Act
        int result = calculator.add(10, 5);
        // Assert
        assertEquals(15, result);
    }

    @Test
    public void testSubtraction() {
        int result = calculator.subtract(10, 5);
        assertEquals(5, result);
    }

    @Test
    public void testMultiplication() {
        int result = calculator.multiply(4, 3);
        assertEquals(12, result);
    }

    @Test
    public void testDivision() {
        double result = calculator.divide(10, 2);
        assertEquals(5.0, result, 0.001);  // Use delta for floating point
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        calculator.divide(10, 0);
    }
}
