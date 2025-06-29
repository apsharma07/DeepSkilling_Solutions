package org.example;

public class ExceptionThrower {

    public void throwException() throws IllegalArgumentException {
        throw new IllegalArgumentException("This is an expected exception");
    }
}
