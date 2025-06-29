package org.example;

import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class UserServiceTest {

    @Test
    public void testGetUsernameById() {
        UserRepository mockRepo = mock(UserRepository.class);
        when(mockRepo.findById("u101")).thenReturn(new User("u101", "Ankit"));
        UserService service = new UserService(mockRepo);
        String result = service.getUsernameById("u101");
        assertEquals("Ankit", result);
        verify(mockRepo).findById("u101");
    }
}
