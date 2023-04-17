package com.example.services.repo;

import com.example.services.domain.User;

import java.util.List;

public interface FakeDb {
    List<User> getAllUsers();
}
