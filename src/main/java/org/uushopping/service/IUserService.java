package org.uushopping.service;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.uushopping.pojo.User;

import java.util.List;

public interface IUserService {
    //通过用户名查询是否存在该用户
    public User ifExist(String username);
    //查询所有用户的信息
    @Select("select * from user ")
    public List<User> getUsers();

    //注册用户
    @Insert("insert into user(username,userPassword,userPhone) VALUES(#{username},#{password},#{phone})")
    public void addUser(String username,String password,String phone);
}
