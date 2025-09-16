package com.example.practice.service;

import com.example.practice.model.User; // User 모델을 불러오는 import 구문 추가
import com.example.practice.repository.UserRepository; // UserRepository도 import해야 합니다.
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository; 

    @Autowired
    public UserService(PasswordEncoder passwordEncoder, UserRepository userRepository) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
    }

    public User registerNewUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        
        return userRepository.save(user);
    }

    public boolean login(String email, String rawPassword) {
        User user = userRepository.findByEmail(email);
        if (user == null) {
            return false; 
        }

        return passwordEncoder.matches(rawPassword, user.getPassword());
    }
}