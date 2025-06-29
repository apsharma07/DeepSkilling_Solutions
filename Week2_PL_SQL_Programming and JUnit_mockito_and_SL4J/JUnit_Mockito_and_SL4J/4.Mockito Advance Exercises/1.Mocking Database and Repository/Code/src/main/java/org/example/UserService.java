package org.example;

public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public String getUsernameById(String id) {
        User user = repository.findById(id);
        return user != null ? user.getName() : "Unknown";
    }
}

