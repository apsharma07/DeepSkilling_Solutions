package org.example;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testVerifyInteractionWithArguments() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);
        service.process();
        verify(mockApi).sendMessage("Hello World");
    }
}
