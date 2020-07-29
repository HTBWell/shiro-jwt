package com.example.demo;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan("com.example.demo.persistence")

class DemoApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        User user=userService.getUser("1");
        System.out.println(user);
    }

}
