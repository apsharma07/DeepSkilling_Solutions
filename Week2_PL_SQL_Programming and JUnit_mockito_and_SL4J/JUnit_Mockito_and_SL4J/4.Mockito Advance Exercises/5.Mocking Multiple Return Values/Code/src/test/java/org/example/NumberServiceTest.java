package org.example;

import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class NumberServiceTest {

    @Test
    public void testMultipleCallsWithDifferentReturns() {
        NumberGenerator mockGenerator = mock(NumberGenerator.class);
        when(mockGenerator.getNext()).thenReturn(10, 20, 30);
        NumberService service = new NumberService(mockGenerator);
        int result = service.sumNextThreeNumbers();
        assertEquals(60, result);
        verify(mockGenerator, times(3)).getNext();
    }
}
