package org.example;

import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class NetworkServiceTest {

    @Test
    public void testNetworkInteraction() {
        NetworkClient mockClient = mock(NetworkClient.class);
        when(mockClient.sendRequest("http://api.example.com/status"))
                .thenReturn("200 OK");
        NetworkService service = new NetworkService(mockClient);
        String result = service.getServerStatus();
        assertEquals("Server Response: 200 OK", result);
        verify(mockClient).sendRequest("http://api.example.com/status");
    }
}
