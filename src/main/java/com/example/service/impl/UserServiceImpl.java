package com.example.service.impl;

import com.example.Enum.UserEnum;
import com.example.dao.UserDao;
import com.example.entity.User;
import com.example.exception.UserException;
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
    public UserException<User> userLists() {
        try {
            List<User> userList = userDao.findAll();
            return new UserException<User>(UserEnum.SUCCESS.getStatus(),UserEnum.SUCCESS.getMessage(),userList);
        } catch (Exception e) {
            return new UserException<User>(UserEnum.SEL_FAIL.getStatus(),UserEnum.SEL_FAIL.getMessage());
        }
    }

    @Override
    public UserException<User> addUser(User user) {
        try {
            User user1 = userDao.save(user);
            return new UserException<User>(UserEnum.SUCCESS.getStatus(),UserEnum.SUCCESS.getMessage(),user1);
        } catch (Exception e) {
            return new UserException<User>(UserEnum.ADD_FAIL.getStatus(),UserEnum.ADD_FAIL.getMessage());
        }

    }

    @Override
    public UserException<User> delUser(Integer id) {
        try {
            userDao.delete(id);
            return new UserException<User>(UserEnum.SUCCESS.getStatus(),UserEnum.SUCCESS.getMessage());
        } catch (Exception e) {
            return new UserException<User>(UserEnum.DEL_FAIL.getStatus(),UserEnum.DEL_FAIL.getMessage());
        }
    }

    @Override
    public UserException<User> updUser(User user) {
        try {
            User save = userDao.save(user);
            return new UserException<User>(UserEnum.SUCCESS.getStatus(),UserEnum.SUCCESS.getMessage(),save);
        } catch (Exception e) {
            return new UserException<User>(UserEnum.UPD_FAIL.getStatus(),UserEnum.UPD_FAIL.getMessage());
        }
    }
}
