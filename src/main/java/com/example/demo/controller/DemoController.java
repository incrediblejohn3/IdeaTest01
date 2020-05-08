package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
public class DemoController {
    @Autowired
    private DemoService demoService;

    @RequestMapping("{moduleName}")
    public String findPage(@PathVariable("moduleName") String moduleName){
        return moduleName;
    }

    @RequestMapping("showTable")
    @ResponseBody
    public List<String> showTables(){
        List<String> list = demoService.showTables();
        for (String table: list
             ) {
            System.out.println(table);
        }
        return list;
    }

    @RequestMapping("showData")
    @ResponseBody
    public List<Map<String,Object>> showData(String tableName){
        List<Map<String,Object>> list = demoService.showData(tableName);
        for (Map<String,Object> data: list
             ) {
            System.out.println(data);
        }
        return list;
    }

    @RequestMapping("findUser")
    @ResponseBody
    public List<User> findUser(){
        List<User> user = demoService.findUser();
        for (User users :
                user) {
            System.out.println(users);
        }
        return user;
    }

    @RequestMapping("insertUser")
    @ResponseBody
    public String insertUser(User user){
        demoService.insertUser(user);
        return "insert ok";
    }

    @RequestMapping("updateUser")
    @ResponseBody
    public int updateUser(User user){
        return demoService.updateUser(user);
    }

    @RequestMapping("deleteUser")
    @ResponseBody
    public int deleteUser(Integer id){
        return demoService.deleteUser(id);
    }

}
