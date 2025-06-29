package org.example;

import org.example.model.User;
import org.example.repository.UserRepository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Before
    public void setUp() {
        userRepository.deleteAll();

        User user1 = new User();
        user1.setId(1L);
        user1.setName("Alice");
        user1.setEmail("alice@example.com");

        User user2 = new User();
        user2.setId(2L);
        user2.setName("Alice");
        user2.setEmail("alice2@example.com");

        User user3 = new User();
        user3.setId(3L);
        user3.setName("Bob");
        user3.setEmail("bob@example.com");

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
    }

    @Test
    public void testFindByName() {
        List<User> results = userRepository.findByName("Alice");

        assertEquals(2, results.size());
        for (User user : results) {
            assertEquals("Alice", user.getName());
        }
    }
}
