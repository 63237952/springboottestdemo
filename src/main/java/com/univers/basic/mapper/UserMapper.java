package com.univers.basic.mapper;

import com.univers.basic.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface  UserMapper {
    public void addUser(User user);
    User getUserById(Long id);
}
