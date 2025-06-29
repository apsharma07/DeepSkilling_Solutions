package org.example;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.example.service.CalculatorService;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class CalculatorServiceTest {

    private CalculatorService calculator = new CalculatorService();

    @Test
    @Parameters({
        "1, 2, 3",
        "5, 7, 12",
        "-1, -1, -2",
        "0, 0, 0"
    })
    public void testAdd(int a, int b, int expected) {
        assertEquals(expected, calculator.add(a, b));
    }
}
