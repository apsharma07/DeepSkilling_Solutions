package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MultiAppenderLogger {

    private static final Logger logger = LoggerFactory.getLogger(MultiAppenderLogger.class);

    public static void main(String[] args) {
        logger.info("Application started.");
        logger.warn("This is a warning.");
        logger.error("Something went wrong.");

        for (int i = 1; i <= 5; i++) {
            logger.info("This is log entry number {}", i);
        }

        logger.info("Application finished.");
    }
}
