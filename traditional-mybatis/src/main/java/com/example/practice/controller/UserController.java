package com.example.practice.controller;


import com.example.practice.mapper.UserMapper;
import com.example.practice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/{userName}")
    public User findByUserName(@PathVariable("userName") String userName) {
        return userMapper.findByUserName(userName);
    }

}