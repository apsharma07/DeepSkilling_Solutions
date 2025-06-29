package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingDemo {

    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingDemo.class);

    public static void main(String[] args) {

        String username = "ankit_k";
        int userId = 101;

        logger.info("User {} with ID {} has logged in.", username, userId);

        double price = 45.99;
        int quantity = 3;
        logger.info("Item added to cart: {} units at ₹{} each", quantity, price);

        try {
            processTransaction(userId);
        } catch (Exception e) {
            logger.error("Transaction failed for user {}: {}", userId, e.getMessage());
        }
    }

    private static void processTransaction(int userId) {
        throw new RuntimeException("Insufficient balance");
    }
}
