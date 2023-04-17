package com.example.services.repo;

import com.example.services.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FakeDbImpl implements FakeDb {

    @Override
    public List<User> getAllUsers() {
        List<User> userList = new ArrayList<>();

        User user1 = new User();
        user1.setFirstname("Alex");
        user1.setLastname("Popovich");

        User user2 = new User();
        user2.setFirstname("John");
        user2.setLastname("Sina");

        userList.add(user1);
        userList.add(user2);

        return userList;
    }
}
