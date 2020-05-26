package com.example.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.pojo.Cart;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CartDao extends BaseMapper<Cart> {
    Integer insertCart(@Param("num") Integer num, @Param("gid") Integer id);
}
