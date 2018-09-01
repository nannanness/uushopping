package org.uushopping.service;

import org.uushopping.pojo.User;

public interface ISuperUserService {
    //添加用户信息
    public void insertUser(String username,String userSex,String userPhone,String userAddress,String userEmail);
    //根据用户名称和注册时间查询用户
    public User selectUser(int userId);
    //更新用户的状态
    public void updateUser(String userFlag ,int userId);
}
