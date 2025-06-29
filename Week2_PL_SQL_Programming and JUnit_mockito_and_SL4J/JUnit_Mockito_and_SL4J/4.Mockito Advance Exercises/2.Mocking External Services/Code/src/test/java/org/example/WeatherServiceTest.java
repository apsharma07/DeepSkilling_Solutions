package org.example;

import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class WeatherServiceTest {

    @Test
    public void testFetchWeather() {
        WeatherClient mockClient = mock(WeatherClient.class);
        when(mockClient.getWeather("Delhi")).thenReturn("Sunny 35°C");
        WeatherService service = new WeatherService(mockClient);
        String result = service.fetchWeather("Delhi");
        assertEquals("Weather in Delhi: Sunny 35°C", result);
        verify(mockClient).getWeather("Delhi");
    }
}
