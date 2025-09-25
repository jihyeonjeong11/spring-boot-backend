package com.example.practice.model;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private String userName;
    private String password;
    private String email;
    private String googleId;
    private String naverId;
    private String refreshToken;
    
    private String useYn;
    private Integer loginFailureCount;
    private Date lastFailureTimestamp;
}