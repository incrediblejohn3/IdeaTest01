package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("test")
public class Item implements Serializable {
    @TableId(value = "id",type = IdType.INPUT)
    private Integer id;
    private String name;
    private String title;
    private String img;
    private Double price;
    private String info;
    private String swiper;
}
