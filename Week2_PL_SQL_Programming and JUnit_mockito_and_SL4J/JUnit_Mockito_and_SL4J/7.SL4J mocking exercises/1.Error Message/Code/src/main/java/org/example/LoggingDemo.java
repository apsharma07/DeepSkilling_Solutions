package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingDemo {

    private static final Logger logger = LoggerFactory.getLogger(LoggingDemo.class);

    public static void main(String[] args) {

        logger.info("Application started.");

        logger.warn("This is a warning. Be cautious!");

        try {
            int result = divide(10, 0);
        } catch (ArithmeticException e) {
            logger.error("An error occurred while dividing numbers: {}", e.getMessage(), e);
        }

        logger.info("Application finished.");
    }

    private static int divide(int a, int b) {
        return a / b;
    }
}
