package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("cart")
public class Cart {
    @TableId(value = "id",type = IdType.INPUT)
    private Integer id;
    private Integer uid;
    private Integer gid;
    private String name;
    private Double price;
    private Integer num;
    private String image;
}
