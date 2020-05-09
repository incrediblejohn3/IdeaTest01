package com.example.demo.service;

import com.example.demo.pojo.User;

import java.util.List;
import java.util.Map;

public interface DemoService {
    List<String> showTables();
    List<Map<String,Object>> showData(String tableName);

    List<User> findUser();
    int insertUser(User user);
    int updateUser(User user);
    int deleteUser(Integer id);

    User findUserById(Integer id);
}
