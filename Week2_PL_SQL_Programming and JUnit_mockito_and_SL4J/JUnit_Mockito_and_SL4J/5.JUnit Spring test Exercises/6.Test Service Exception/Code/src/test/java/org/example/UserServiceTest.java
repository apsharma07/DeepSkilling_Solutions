package org.example;

import org.example.exception.UserNotFoundException;
import org.example.model.User;
import org.example.repository.UserRepository;
import org.example.service.UserService;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.Mock;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.assertThrows;

@RunWith(SpringRunner.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test(expected = UserNotFoundException.class)
    public void testGetUserById_NotFound() {
        // Given
        Long userId = 99L;
        when(userRepository.findById(userId)).thenReturn(Optional.empty());

        // When - then
        userService.getUserById(userId); // Should throw UserNotFoundException
    }
}
