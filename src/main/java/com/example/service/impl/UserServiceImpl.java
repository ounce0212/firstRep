package com.example.service.impl;

import com.example.dao.UserDao;
import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @项目：test
 * @创建者：linmin
 * @创建时间：2017/12/27
 * @公司：汽车易生活
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional(readOnly = true)
    public List<User> userLists() {
        return userDao.findAll();
    }

    @Override
    public User addUser(User user) {
        return userDao.save(user);
    }

    @Override
    public void delUser(Integer id) {
        userDao.delete(id);
    }

    @Override
    public User updUser(User user) {
        return userDao.save(user);
    }
}
