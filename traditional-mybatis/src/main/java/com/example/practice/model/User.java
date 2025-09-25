package com.example.practice.model;

import java.time.LocalDateTime;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(exclude = "password")
public class User {
   
    private Long id;
    private String username; // SQL의 username 컬럼과 매핑
    private String password; // SQL의 password 컬럼과 매핑
    private String name;
    private String email;
    private String roles;
    private boolean enabled = true;
    private LocalDateTime createdAt; // SQL의 created_at 컬럼과 매핑
    private LocalDateTime updatedAt;
}