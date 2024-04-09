import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

class CalculatorTest {
    @Test
    public void add() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 10);
        assertEquals(15, result);
    }
}