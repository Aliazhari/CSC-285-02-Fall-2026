import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
@Test
public void testAdd() {
Calculator calculator = new Calculator();
assertEquals(5, calculator.add(2, 3));
}

@Test
public void testSubtract() {
Calculator calculator = new Calculator();
assertEquals(1, calculator.subtract(5, 3));
}

@Test
public void testMultiply() {
Calculator calculator = new Calculator();
assertEquals(6, calculator.multiply(2, 3));
}

@Test
public void testDivide() {
Calculator calculator = new Calculator();
assertEquals(2, calculator.divide(10, 5));
}
} 

