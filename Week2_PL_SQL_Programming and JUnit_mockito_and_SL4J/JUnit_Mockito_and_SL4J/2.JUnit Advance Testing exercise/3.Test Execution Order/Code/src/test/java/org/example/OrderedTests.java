package org.example;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrderedTests {
    Calculator calculator = new Calculator();

    @Test
    public void testA_First() {
        System.out.println("Running first test");
        assertEquals("Hello", "He" + "llo");
    }

    @Test
    public void testB_Second() {
        System.out.println("Running second test");
        assertEquals(9, calculator.add(4, 5));
    }

    @Test
    public void testC_Third() {
        System.out.println("Running third test");
        assertEquals(9, calculator.mul(3, 3));
    }
}
