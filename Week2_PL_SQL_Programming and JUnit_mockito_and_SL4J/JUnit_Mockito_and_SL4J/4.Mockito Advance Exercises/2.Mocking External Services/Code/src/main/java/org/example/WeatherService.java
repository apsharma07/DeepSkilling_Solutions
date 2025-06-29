package org.example;

public class WeatherService {
    private final WeatherClient client;

    public WeatherService(WeatherClient client) {
        this.client = client;
    }

    public String fetchWeather(String city) {
        String response = client.getWeather(city);
        return "Weather in " + city + ": " + response;
    }
}
