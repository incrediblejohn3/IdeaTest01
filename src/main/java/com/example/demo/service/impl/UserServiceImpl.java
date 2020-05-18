package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.UserDao;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findUser() {
//        QueryWrapper<User> qw= new QueryWrapper<>();
//        qw.le("id",23);
//        qw.orderByDesc("id");
//        List<User> list = super.list(qw);
//        return list;
        return super.list();
    }

    @Override
    public int insertUser(User user) {
        super.save(user);

        return 1;
    }

    @Override
    public User findUserById(Integer id) {
        User user = super.getById(id);
        return user;
    }

    @Override
    public int updateUser(User user) {
        QueryWrapper<User> qw = new QueryWrapper<>();
        qw.eq("id",user.getId());
        super.update(user,qw);
        return 1;
    }

    @Override
    public int deleteUser(Integer id) {
        super.removeById(id);
        return 1;
    }
}
