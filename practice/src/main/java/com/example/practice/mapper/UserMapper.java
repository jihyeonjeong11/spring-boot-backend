package com.example.practice.mapper;

import com.example.practice.model.User;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAllUsers();
    User findUserById(Long id);
    void insertUser(User user);
}