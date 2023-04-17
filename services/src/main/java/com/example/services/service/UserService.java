package com.example.services.service;

import com.example.services.domain.User;

import java.util.List;

public interface UserService {
    List<User> getAllActiveUsers();
}
