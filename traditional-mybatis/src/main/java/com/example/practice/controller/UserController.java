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

    @GetMapping
    public List<User> getAllUsers() {
        return userMapper.findAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Long id) {
        return userMapper.findUserById(id);
    }

    @PostMapping
    public void addUser(@RequestBody User user) {
        userMapper.insertUser(user);
    }
}