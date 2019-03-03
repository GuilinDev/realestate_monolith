package com.guilin.realestate.service;

import com.guilin.realestate.common.model.User;
import com.guilin.realestate.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getUsers() {
        return userMapper.selectUsers();
    }
}
