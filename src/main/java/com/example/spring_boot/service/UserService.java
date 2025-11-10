package com.example.spring_boot.service;

import com.example.spring_boot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void saveUser(User user);
    void updateUser(Long id, User user);
    User getUserById(Long id);
    void deleteUser(Long id);
}