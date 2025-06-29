package org.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    private User sampleUser;

    @Before
    public void setUp() {
        sampleUser = new User(1L, "Ankit");
    }

    @Test
    public void testGetUserById_UserExists() {
        when(userRepository.findById(1L)).thenReturn(Optional.of(sampleUser));

        User result = userService.getUserById(1L);

        assertNotNull(result);
        assertEquals("Ankit", result.getName());
        assertEquals(Long.valueOf(1), result.getId());
    }

    @Test
    public void testGetUserById_UserNotFound() {
        when(userRepository.findById(2L)).thenReturn(Optional.empty());

        User result = userService.getUserById(2L);

        assertNull(result);
    }
}
