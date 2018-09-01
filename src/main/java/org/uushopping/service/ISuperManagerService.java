package org.uushopping.service;

import org.uushopping.pojo.ManagerHistory;
import org.uushopping.pojo.SuperManager;

import java.util.List;

public interface ISuperManagerService {
    //查询管理员个人信息
    public SuperManager getSuperManagerInfoById(int managerId);

    //查找超级管理员信息
    public SuperManager findSuperManagerInfoByNameAndPassword(String name , String password);
    //更新超级管理员信息
    public void updateSM(String name,String phone,String email,String qq,int id);
    //超级管理员登录信息
    public List<ManagerHistory> findManagerHistoryByID(int managerId);
    //插入id和时间到管理员记录表中
    public void insertManagerHistory(int managerId,String loginDate);

}
