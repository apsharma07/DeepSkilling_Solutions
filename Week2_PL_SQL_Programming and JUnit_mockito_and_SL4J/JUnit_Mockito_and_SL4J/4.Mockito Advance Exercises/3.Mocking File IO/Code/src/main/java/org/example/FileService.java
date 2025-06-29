package org.example;

public class FileService {
    private final FileHandler handler;

    public FileService(FileHandler handler) {
        this.handler = handler;
    }

    public String readFromFile(String path) {
        return handler.read(path);
    }

    public void appendAndWrite(String path, String newContent) {
        String existing = handler.read(path);
        handler.write(path, existing + newContent);
    }
}
