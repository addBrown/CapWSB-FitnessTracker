package com.capgemini.wsb.fitnesstracker.user.api;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User createUser(User user);
    Optional<User> getUser(Long userId);
    Optional<User> getUserByEmail(String email);
    List<User> getUsersByAge(int age);
    boolean deleteUser(Long id);
    User updateUser(Long id, User updatedUser);
}
