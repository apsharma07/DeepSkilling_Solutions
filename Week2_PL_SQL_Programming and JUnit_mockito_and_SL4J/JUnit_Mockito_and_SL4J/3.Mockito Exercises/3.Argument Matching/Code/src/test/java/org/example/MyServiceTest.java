package org.example;

import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.*;

public class MyServiceTest {

    @Test
    public void testArgumentMatchers() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);
        service.update();
        verify(mockApi).updateUser(eq("user123"), anyInt());
    }
}
