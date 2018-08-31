package org.uushopping.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.uushopping.mapper.UserMapper;
import org.uushopping.pojo.User;
import org.uushopping.service.IUserService;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User ifExist(String username) {
        User user = userMapper.ifExist(username);
        return user;
    }

    @Override
    public List<User> getUsers() {
        List<User> users = userMapper.getUsers();
        return users;
    }

    @Override
    public void addUser(String username, String password, String phone) {
        userMapper.addUser(username,password,phone);
    }
}
