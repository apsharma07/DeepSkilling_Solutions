package org.example;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CalculatorTest.class,
        StringUtilsTest.class
})
public class AllTests {
    // No methods needed here
}
