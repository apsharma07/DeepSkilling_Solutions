package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExceptionThrowerTest {

    @Test(expected = IllegalArgumentException.class)
    public void testExceptionIsThrown() {
        ExceptionThrower thrower = new ExceptionThrower();
        thrower.throwException();
    }

    @Test
    public void testExceptionMessage() {
        ExceptionThrower thrower = new ExceptionThrower();
        try {
            thrower.throwException();
            fail("Exception was not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("This is an expected exception", e.getMessage());
        }
    }
}
