package org.uushopping.service;

import org.uushopping.pojo.ManagerHistory;
import org.uushopping.pojo.SuperManager;

import java.util.List;

public interface ISuperManagerService {
    //查询管理员个人信息
    public SuperManager getSuperManagerInfoById(int managerId);

    //查找超级管理员信息
    public SuperManager findSuperManagerInfoByNameAndPassword(String name , String password);
    //超级管理员登录信息
    public List<ManagerHistory> findManagerHistoryByID(int managerId);
    //超级管理员登录信息分页
    public List<ManagerHistory> findManagerHistoryByPage();
    //插入id和时间到管理员记录表中
    public void insertManagerHistory(int managerId,String loginDate);
}
