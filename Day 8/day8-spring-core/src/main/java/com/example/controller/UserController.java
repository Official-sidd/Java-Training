package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.service.UserService;

@Component
public class UserController {

    @Autowired
    private UserService userService;

    public void handleRequest() {
        System.out.println(userService.processUser());
    }
}