package org.example;

public class NetworkService {
    private final NetworkClient client;

    public NetworkService(NetworkClient client) {
        this.client = client;
    }

    public String getServerStatus() {
        String response = client.sendRequest("http://api.example.com/status");
        return "Server Response: " + response;
    }
}
