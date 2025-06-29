package org.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorServiceTest {

    private CalculatorService calculatorService;

    @Before
    public void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    public void testAdd_PositiveNumbers() {
        int result = calculatorService.add(10, 5);
        assertEquals(15, result);
    }

    @Test
    public void testAdd_NegativeNumbers() {
        int result = calculatorService.add(-3, -7);
        assertEquals(-10, result);
    }

    @Test
    public void testAdd_MixedNumbers() {
        int result = calculatorService.add(-4, 9);
        assertEquals(5, result);
    }

    @Test
    public void testAdd_WithZero() {
        int result = calculatorService.add(0, 7);
        assertEquals(7, result);
    }
}
