package com.example.practice.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(exclude = "password")
public class User {
    private Long id;
    private String name;
    private String email;
    private String password;
}