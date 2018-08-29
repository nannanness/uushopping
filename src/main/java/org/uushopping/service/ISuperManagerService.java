package org.uushopping.service;

import org.uushopping.pojo.SuperManager;

public interface ISuperManagerService {
    //查询管理员个人信息
    public SuperManager getSuperManagerInfoById(int managerId);

    //查找超级管理员信息
    public SuperManager findSuperManagerInfoByNameAndPassword(String name , String password);
}
