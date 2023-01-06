package com.univers.basic;

import com.univers.basic.controller.UserController;
import com.univers.basic.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = SpringBootTestDemo.class)
@RunWith(SpringRunner.class)
public class Demotest {
    @Autowired
    private UserService userService;
    @Autowired
    private UserController userController;
    @Test
    public void add(){
        userController.User();
    }
}
