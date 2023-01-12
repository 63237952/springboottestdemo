package com.univers.basic.controller;

import com.univers.basic.Constant_Interface;
import com.univers.basic.entity.User;
import com.univers.basic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/request")
public class UserController {
    @Autowired
    private  UserService userService;
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public @ResponseBody String User(){
        User user = new User();
        user.setAge(19);
//        user.setId(2L);
        user.setName("hongli"+ Constant_Interface.constant+"aaa");
        user.setGmt_create(new Date());
        user.setGmt_modified(new Date());
        userService.addUser(user);
//        String format = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").format(new Date());
        return "添加成功";
    }
    //通过指定id查询用户，并返回
    @GetMapping("/getUser/{id}")
    public @ResponseBody User getUser(@PathVariable("id")Long id){
        User user = userService.getUserById(id);
        return user;
    }
}
