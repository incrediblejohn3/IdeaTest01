package com.example.demo.controller;

import com.example.demo.pojo.Item;
import com.example.demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/findItems")
    public List<Item> findItems(){
        List<Item> items = itemService.findItems();
        for (Object obj :
                items) {
            System.out.println(obj);
        }
        return items;
    }

    @RequestMapping("/findItemById")
    public Item findItemById(Integer id){
        Item item = itemService.findItemById(id);
        System.out.println(item);
        return item;
    }
}
