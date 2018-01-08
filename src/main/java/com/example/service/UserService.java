package com.example.service;

import com.example.entity.User;
import com.example.exception.UserException;

/**
 * @项目：test
 * @创建者：linmin
 * @创建时间：2017/12/27
 * @公司：汽车易生活
 */
public interface UserService {
    UserException<User> userLists();

    UserException<User> addUser(User user);

    UserException<User> delUser(Integer id);

    UserException<User> updUser(User user);
}
