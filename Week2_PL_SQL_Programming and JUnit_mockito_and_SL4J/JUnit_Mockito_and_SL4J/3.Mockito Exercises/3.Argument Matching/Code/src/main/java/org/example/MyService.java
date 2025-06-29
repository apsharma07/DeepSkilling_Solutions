package org.example;

public class MyService {
    private final ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public void update() {
        api.updateUser("user123", 25);
    }
}
