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

    public List<User> getAllUsers() {
        return userMapper.findAllUsers();
    }
    
    public User getUserById(Long id) {
        return userMapper.findUserById(id);
    }
    
    public void addUser(User user) {
        // 비즈니스 로직 추가 가능 (예: 이메일 형식 검증)
        userMapper.insertUser(user);
    }

    // public User registerNewUser(User user) {
    //     user.setPassword(passwordEncoder.encode(user.getPassword()));
        
    //     return userRepository.save(user);
    // }

    // public boolean login(String email, String rawPassword) {
    //     User user = userRepository.findByEmail(email);
    //     if (user == null) {
    //         return false; 
    //     }

    //     return passwordEncoder.matches(rawPassword, user.getPassword());
    // }
}