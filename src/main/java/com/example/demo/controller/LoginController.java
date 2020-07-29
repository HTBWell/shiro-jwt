package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import com.example.demo.utils.JWTUtil;
import com.example.demo.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;

@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Result login(@RequestParam String username, @RequestParam String password) throws UnsupportedEncodingException {
        User user=userService.getUserByPass(username, password);
        Assert.notNull(user,"用户名或密码错误");
        String token= JWTUtil.createToken(user);
        return Result.succ(200,"登陆成功",token);
    }

    @RequestMapping(path = "/unauthorized/{message}")
    public Result unauthorized(@PathVariable String message) throws UnsupportedEncodingException {
        return Result.fail(message);
    }
}
