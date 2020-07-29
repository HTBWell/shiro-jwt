package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.persistence.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUser(String username){
        return userMapper.getUser(username);
    }

    public User getUserByPass(String username,String password){
        return userMapper.getUserByPass(username, password);
    }
}
