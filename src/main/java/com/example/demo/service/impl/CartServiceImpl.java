package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.CartDao;
import com.example.demo.pojo.Cart;
import com.example.demo.service.CartService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl extends ServiceImpl<CartDao, Cart> implements CartService {
    @Autowired
    private CartDao cartDao;

    @Override
    public List<Cart> findCart() {
        return super.list();
    }

    @Override
    public int deleteCart(@Param("id") Integer id) {
        if (id<1||id==null)
            throw new IllegalArgumentException("id错误");
//        QueryWrapper<Cart> qw = new QueryWrapper<>();
//        qw.eq("id",id);
        boolean b = super.removeById(id);
        if(!b)
            throw new IllegalArgumentException("删除失败");
        return 1;
    }

    @Override
    public int insertCart(Integer num, Integer id) {
        if (id==null)
            throw new IllegalArgumentException("数据为空");
        Integer res = cartDao.insertCart(num,id);
        if(res==0||res==null)
            throw new IllegalArgumentException("保存失败");
        return 1;
    }


}
