package KW13.UnitTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DemoTest {

    @Test
    public void testMaxWithPositiveNumbers() {
        Demo demo = new Demo();
        int result = demo.max(5, 10);
        assertEquals(10, result);
    }

    @Test
    public void testMaxWithNegativeNumbers() {
        Demo demo = new Demo();
        int result = demo.max(-5, -10);
        assertEquals(-5, result);
    }

    @Test
    public void testMaxWithEqualNumbers() {
        Demo demo = new Demo();
        int result = demo.max(7, 7);
        assertEquals(7, result);
    }
}