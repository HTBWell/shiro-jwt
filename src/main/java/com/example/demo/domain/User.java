package com.example.demo.domain;

import lombok.Data;

@Data
public class User {
    private String username;
    private String name;
    private String password;
    private String roles;
    private String permission;
}
