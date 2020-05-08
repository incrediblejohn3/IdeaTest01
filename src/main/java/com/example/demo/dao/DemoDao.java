package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface DemoDao {
    @Select("show tables")
    List<String> showTables();

    @Select("select * from ${tableName}")
    List<Map<String,Object>> showData(@Param("tableName") String tableName);
}
