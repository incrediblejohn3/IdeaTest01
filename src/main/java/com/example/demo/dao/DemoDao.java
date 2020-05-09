package com.example.demo.dao;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Delete;
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

    @Select("select * from test")
    List<User> findUser();

    @Delete("delete from test where id=${id}")
    int deleteUser(@Param("id") Integer id);

    int insertUser(User user);
    int updateUser(User user);

    @Select("select name,sex,age from test where id=${id}")
    User findUserById(@Param("id") Integer id);
}
