package com.example.demo.controller;

import com.example.demo.service.UserService;
import com.example.demo.utils.Result;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequiresAuthentication
    @GetMapping("/test")
    public Result test(){
        return Result.succ("test");
    }

    @RequiresRoles("admin")
    @GetMapping("/admin")
    public Result admin(){
        return Result.succ("admin");
    }

    @RequiresRoles("vip")
    @PostMapping("/vip")
    public Result vip(){
        return Result.succ("vip");
    }

    @RequiresPermissions("update")
    @PutMapping("/update")
    public Result update(){
        return Result.succ("update");
    }

    @RequiresPermissions("delete")
    @DeleteMapping("/delete")
    public Result delete(){
        return Result.succ("delete");
    }

    @GetMapping("/guest")
    public Result guest(){
        return Result.succ("guest");
    }

}
