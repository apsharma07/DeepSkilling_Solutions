package org.example;
public interface ExternalApi {
    String getData();
    void performAction(String input);
    void dangerousOperation() throws Exception;
}
