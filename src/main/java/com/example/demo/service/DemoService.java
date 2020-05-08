package com.example.demo.service;

import java.util.List;
import java.util.Map;

public interface DemoService {
    List<String> showTables();
    List<Map<String,Object>> showData(String tableName);
}
