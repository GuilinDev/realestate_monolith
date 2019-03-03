package com.guilin.realestate.controller;

import com.guilin.realestate.common.model.User;
import com.guilin.realestate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("user")
    public List<User> getUsers() {
        return userService.getUsers();
    }
}
