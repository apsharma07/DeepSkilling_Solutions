package org.example;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testVoidMethodStubAndVerify() {
        ExternalApi mockApi = mock(ExternalApi.class);
        doNothing().when(mockApi).logEvent(anyString());
        MyService service = new MyService(mockApi);
        service.processEvent();
        verify(mockApi).logEvent("UserLoggedIn");
    }
}
