package org.example;

public interface FileHandler {
    String read(String filePath);
    void write(String filePath, String content);
}
