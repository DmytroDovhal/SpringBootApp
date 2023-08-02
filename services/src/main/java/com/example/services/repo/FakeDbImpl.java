package com.example.services.repo;

import com.example.services.domain.RepoUser;
import com.example.services.domain.UserDto;
import com.example.services.domain.mapper.UserMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FakeDbImpl implements FakeDb {

    private final UserMapper mapper;

    public FakeDbImpl(UserMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<UserDto> userDtoList = new ArrayList<>();

        RepoUser repoUser1 = new RepoUser();
        repoUser1.setName("Alex");
        repoUser1.setSurname("Miller");

        RepoUser repoUser2 = new RepoUser();
        repoUser2.setName("John");
        repoUser2.setSurname("Snow");

        userDtoList.add(mapper.toDto(repoUser1));
        userDtoList.add(mapper.toDto(repoUser2));

        return userDtoList;
    }
}
