package com.example.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.pojo.Cart;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CartDao extends BaseMapper<Cart> {
}
