package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    // ✅ Setup Method (Test Fixture)
    @Before
    public void setUp() {
        calculator = new Calculator(); // Arrange: Common setup before each test
        System.out.println("Setup completed.");
    }

    // ✅ Teardown Method
    @After
    public void tearDown() {
        calculator = null; // Cleanup
        System.out.println("Teardown completed.");
    }

    @Test
    public void testAddition() {
        // Arrange: (setup is already done in setUp)

        // Act:
        int result = calculator.add(10, 20);

        // Assert:
        assertEquals(30, result);
    }

    @Test
    public void testSubtraction() {
        // Arrange:

        // Act:
        int result = calculator.sub(50, 20);

        // Assert:
        assertEquals(30, result);
    }
}
