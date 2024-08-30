package com.kabin.SpringSecTelusko.controller;

import com.kabin.SpringSecTelusko.model.Users;
import com.kabin.SpringSecTelusko.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public Users register(@RequestBody Users users) {
        return service.register(users);
    }
}
