package org.example;

import org.junit.Test;
import static org.mockito.Mockito.*;

import org.mockito.InOrder;

public class MyServiceTest {

    @Test
    public void testInteractionOrder() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);
        service.performOperations();
        InOrder inOrder = inOrder(mockApi);
        inOrder.verify(mockApi).authenticate();
        inOrder.verify(mockApi).fetchData();
        inOrder.verify(mockApi).logout();
    }
}
