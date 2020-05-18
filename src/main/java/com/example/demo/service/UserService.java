package com.example.demo.service;

import com.example.demo.pojo.User;

import java.util.List;

public interface UserService {
    List<User> findUser();

    int insertUser(User user);

    User findUserById(Integer id);

    int updateUser(User user);

    int deleteUser(Integer id);
}
