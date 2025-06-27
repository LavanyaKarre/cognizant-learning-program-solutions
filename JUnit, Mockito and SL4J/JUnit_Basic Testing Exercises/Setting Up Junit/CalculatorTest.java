import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(8, calc.add(5, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(15, calc.multiply(5, 3));
        assertEquals(0,  calc.multiply(0, 100));
        assertEquals(-12, calc.multiply(-3, 4));
    }
}
