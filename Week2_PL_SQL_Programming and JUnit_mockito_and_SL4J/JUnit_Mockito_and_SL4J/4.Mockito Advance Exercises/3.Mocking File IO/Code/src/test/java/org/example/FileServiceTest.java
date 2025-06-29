package org.example;

import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class FileServiceTest {

    @Test
    public void testReadFromFile() {
        FileHandler mockHandler = mock(FileHandler.class);
        when(mockHandler.read("test.txt")).thenReturn("Hello, World!");
        FileService service = new FileService(mockHandler);
        String result = service.readFromFile("test.txt");
        assertEquals("Hello, World!", result);
        verify(mockHandler).read("test.txt");
    }

    @Test
    public void testAppendAndWrite() {
        FileHandler mockHandler = mock(FileHandler.class);
        when(mockHandler.read("log.txt")).thenReturn("Old Log\n");
        FileService service = new FileService(mockHandler);
        service.appendAndWrite("log.txt", "New Entry\n");
        verify(mockHandler).read("log.txt");
        verify(mockHandler).write("log.txt", "Old Log\nNew Entry\n");
    }
}
