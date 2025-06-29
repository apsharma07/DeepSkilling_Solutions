package org.example;

import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class MyServiceTest {

    @Test
    public void testMultipleReturnValues() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getStatus()).thenReturn("Pending", "Processing", "Completed");
        MyService service = new MyService(mockApi);
        assertEquals("Pending", service.checkStatus());
        assertEquals("Processing", service.checkStatus());
        assertEquals("Completed", service.checkStatus());
    }
}
