package com.example.demo.controller;

import com.example.demo.pojo.Cart;
import com.example.demo.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartController {
    @Autowired
    private CartService cartService;

    @RequestMapping("/findCart")
    public List<Cart> findCart(){
        List<Cart> list = cartService.findCart();
        for (Cart cart:
             list) {
            System.out.println(cart);
        }
        return list;
    }

    @RequestMapping("/insertCart")
    public String insertCart(Integer num, Integer id){
        cartService.insertCart(num,id);
        return "done";
    }

    @RequestMapping("/deleteCart")
    public String deleteCart(Integer id){
        cartService.deleteCart(id);
        return "done";
    }
}
