package com.example.services.repo;

import com.example.services.domain.UserDto;

import java.util.List;

public interface FakeDb {
    List<UserDto> getAllUsers();
}
