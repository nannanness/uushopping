package org.uushopping.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.uushopping.mapper.SuperUserMapper;
import org.uushopping.pojo.User;
import org.uushopping.service.ISuperUserService;

import javax.resource.spi.AuthenticationMechanism;

@Service
public class SuperUserServiceImpl implements ISuperUserService {
    @Autowired
    SuperUserMapper superUserMapper;
    @Override
    public void insertUser(String username, String userSex, String userPhone, String userAddress, String userEmail) {
        superUserMapper.insertUser(username, userSex, userPhone, userAddress, userEmail);
    }

    @Override
    public User selectUser(int userId) {
        return superUserMapper.selectUser(userId);
    }

    @Override
    public void updateUser(String userFlag , int userId) {
        superUserMapper.updateUser(userFlag,userId);
    }
}
