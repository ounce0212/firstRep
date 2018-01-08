package com.example.controller;

import com.example.entity.User;
import com.example.exception.UserException;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @项目：test
 * @创建者：linmin
 * @创建时间：2017/12/27
 * @公司：汽车易生活
 */

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public UserException<User> list(){
        return userService.userLists();
    }

    @PostMapping("/addUser")
    public UserException<User> addUser(User user){
        return userService.addUser(user);
    }

    @GetMapping("/delUser/{id}")
    public UserException<User> delUser(@PathVariable("id") Integer id){
        return userService.delUser(id);
    }

    @PutMapping("/updUser")
    public UserException<User> updUser(User user){
        return userService.updUser(user);
    }
}
