package com.example.demo.service.impl;

import com.example.demo.dao.DemoDao;
import com.example.demo.pojo.User;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private DemoDao demoDao;

    @Override
    public List<String> showTables() {
        return demoDao.showTables();
    }

    @Override
    public List<Map<String, Object>> showData(String tableName) {
        return demoDao.showData(tableName);
    }

    @Override
    public List<User> findUser() {
        return demoDao.findUser();
    }

    @Override
    public int insertUser(User user) {
        return demoDao.insertUser(user);
    }

    @Override
    public int updateUser(User user) {
        if (user.getId()==null||user.getId()<1)
            return 0;
        return demoDao.updateUser(user);
    }

    @Override
    public int deleteUser(Integer id) {
        if(id<1)
            return 0;
        int i = demoDao.deleteUser(id);
        if(i<1)
            return 0;
        return i;
    }


}
