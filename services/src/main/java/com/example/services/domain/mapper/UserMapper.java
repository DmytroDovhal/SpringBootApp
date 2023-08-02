package com.example.services.domain.mapper;

import com.example.services.domain.RepoUser;
import com.example.services.domain.UserDto;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

@Mapper(componentModel = "spring")
public abstract class UserMapper {
    private final Logger logger = LoggerFactory.getLogger(UserMapper.class);

    @Mapping(source = "repoUser.name", target = "firstName")
    @Mapping(source = "repoUser.surname", target = "lastName")
    public abstract UserDto toDto(RepoUser repoUser);

    @AfterMapping
    public void setUuid(RepoUser repoUser, @MappingTarget UserDto userDto) {
        userDto.setUuid(String.valueOf(UUID.randomUUID()));
    }
}
