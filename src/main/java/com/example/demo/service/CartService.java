package com.example.demo.service;

import com.example.demo.pojo.Cart;

import java.util.List;

public interface CartService {
    List<Cart> findCart();
    int deleteCart(Integer id);

    int insertCart(Integer num, Integer id);

}
