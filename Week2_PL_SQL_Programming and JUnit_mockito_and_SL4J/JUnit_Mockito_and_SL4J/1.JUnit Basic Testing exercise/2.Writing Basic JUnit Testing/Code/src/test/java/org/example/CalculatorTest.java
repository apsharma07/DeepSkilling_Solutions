package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        int sum = calc.add(2, 3);
        assertEquals(5, sum);
    }
    @Test
    public void testSub() {
        Calculator calc = new Calculator();
        int sub=calc.sub(2,3);
        assertEquals(-1,sub);
    }
    @Test
    public void testMul() {
        Calculator calc = new Calculator();
        int mul=calc.mul(2,3);
        assertEquals(6,mul);
    }
}
