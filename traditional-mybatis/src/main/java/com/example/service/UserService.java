package com.example.practice.service;

import com.example.practice.mapper.UserMapper;
import com.example.practice.model.User; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class UserService {

    private final PasswordEncoder passwordEncoder;
    private final UserMapper userMapper;


    @Autowired
    public UserService(PasswordEncoder passwordEncoder, UserMapper userMapper) {
        this.passwordEncoder = passwordEncoder;
        this.userMapper = userMapper;
    }

    public User findByUserName(String userName) {
        return userMapper.findByUserName(userName);
    }
    
}