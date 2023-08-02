package com.example.services.service;

import com.example.services.domain.UserDto;
import com.example.services.repo.FakeDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final FakeDb fakeDb;

    @Autowired
    public UserServiceImpl(FakeDb fakeDb) {
        this.fakeDb = fakeDb;
    }

    @Override
    public List<UserDto> getAllActiveUsers() {
        return fakeDb.getAllUsers();
    }
}
