package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public List<User> list(){
        return userService.userLists();
    }

    @PostMapping("/addUser")
    public User addUser(User user){
        return userService.addUser(user);
    }

    @DeleteMapping("/delUser/{id}")
    public void delUser(@PathVariable("id") Integer id){
        userService.delUser(id);
    }

    @PutMapping("/updUser")
    public User updUser(User user){
        return userService.updUser(user);
    }
}
