package org.example;

public class MyService {
    private final ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }

    public void doSomething(String input) {
        api.performAction(input);
    }

    public void handleDangerousOperation() throws Exception {
        api.dangerousOperation();
    }
}
