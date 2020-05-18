package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * MybatisPlus 实现增删改查
 *  Q:insert: id值自增,新增操作不传id值报错
 *            在实体类的id上添加 @TableId(value = "id",type = IdType.INPUT)注解
 */
@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserService userSerivce;

    @RequestMapping("mpFindUser")
    public List<User> findUser(){
        List<User> user = userSerivce.findUser();
        for (User users :
                user) {
            System.out.println(users);
        }
        return user;
    }

    @RequestMapping("mpInsertUser")
    public String insertUser(User user){
        userSerivce.insertUser(user);
        return "insert ok";
    }

    @RequestMapping("mpFindUserById")
    public User findUserById(Integer id){
        return userSerivce.findUserById(id);
    }

    @RequestMapping("mpUpdateUser")
    public String updateUser(User user){
        userSerivce.updateUser(user);
        return "update ok";
    }

    @RequestMapping("mpDeleteUser")
    public String deleteUser(Integer id){
        userSerivce.deleteUser(id);
        return "delete ok";
    }
}
