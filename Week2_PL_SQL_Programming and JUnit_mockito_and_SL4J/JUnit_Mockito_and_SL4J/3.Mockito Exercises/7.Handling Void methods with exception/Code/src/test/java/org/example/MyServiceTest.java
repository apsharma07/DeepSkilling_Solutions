package org.example;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test(expected = RuntimeException.class)
    public void testVoidMethodThrowsException() {
        ExternalApi mockApi = mock(ExternalApi.class);
        doThrow(new RuntimeException("Deletion failed")).when(mockApi).deleteResource("123");
        MyService service = new MyService(mockApi);
        service.removeResource("123");
        verify(mockApi).deleteResource("123");
    }
}
