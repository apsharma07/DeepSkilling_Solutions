package org.example;

public class PerformanceTester {

    public void performTask() {
        // Simulate some delay (e.g., 300ms)
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
