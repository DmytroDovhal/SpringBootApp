package com.example.services.service;

import com.example.services.domain.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> getAllActiveUsers();
}
