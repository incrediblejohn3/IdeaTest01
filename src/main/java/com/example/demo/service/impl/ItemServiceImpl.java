package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.ItemDao;
import com.example.demo.pojo.Item;
import com.example.demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl extends ServiceImpl<ItemDao, Item> implements ItemService {
    @Autowired
    private ItemDao itemDao;

    @Override
    public List<Item> findItems() {
//        QueryWrapper<Item> qw = new QueryWrapper<>();
//        qw.le("id",30);
        List<Item> list = super.list();
        return list;
    }

    @Override
    public Item findItemById(Integer id) {
        QueryWrapper<Item> qw = new QueryWrapper<>();
        qw.eq("id",id);
        return super.getOne(qw);
    }


}
