package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class EvenCheckerTest {

    private final int input;
    private final EvenChecker checker = new EvenChecker();

    public EvenCheckerTest(int input) {
        this.input = input;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2}, {4}, {6}
        });
    }

    @Test
    public void testEvenNumbers() {
        assertTrue(checker.isEven(input));
    }
}
