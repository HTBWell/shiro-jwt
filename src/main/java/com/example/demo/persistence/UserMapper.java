package com.example.demo.persistence;

import com.example.demo.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User getUser(String username);

    User getUserByPass(String username,String password);

}
