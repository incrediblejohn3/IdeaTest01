package com.example.demo.service.impl;

import com.example.demo.dao.DemoDao;
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
}
