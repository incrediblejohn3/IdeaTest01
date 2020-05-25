package com.example.demo.service;

import com.example.demo.pojo.Item;

import java.util.List;

public interface ItemService {
    List<Item> findItems();
    Item findItemById(Integer id);
}
