package com.univers.basic.service.impl;

import com.univers.basic.Constant_Interface;
import com.univers.basic.entity.User;
import com.univers.basic.mapper.UserMapper;
import com.univers.basic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public User getUserById(Long id) {
        return userMapper.getUserById(id);
    }
}
