package org.uushopping.mapper;

import org.uushopping.pojo.User;

import java.util.List;

public interface SuperUserMapper {
    //添加用户信息
    public void insertUser(String username,String userSex,String userPhone,String userAddress,String userEmail);
    //通过查询用户名称和用户时间查询用户
    public User selectUser(int userId);
    //通过id来更新用户的状态
    public void updateUser(String userFlag , int userId);
}

