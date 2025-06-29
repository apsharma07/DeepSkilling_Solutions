package org.example;

import org.junit.Test;

public class PerformanceTesterTest {

    @Test(timeout = 500) // test will fail if it takes more than 500ms
    public void testPerformTaskWithinTime() {
        PerformanceTester tester = new PerformanceTester();
        tester.performTask();
    }
}
