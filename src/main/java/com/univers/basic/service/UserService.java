package com.univers.basic.service;

import com.univers.basic.entity.User;
import org.springframework.stereotype.Service;


public interface UserService {
    void addUser(User user);
    User getUserById(Long id);
}
