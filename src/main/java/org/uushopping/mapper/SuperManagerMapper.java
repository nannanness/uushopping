package org.uushopping.mapper;
/**
 * 超级管理员mapper文件
 */

import org.springframework.stereotype.Repository;
import org.uushopping.pojo.ManagerHistory;
import org.uushopping.pojo.SuperManager;

import java.util.List;

@Repository
public interface SuperManagerMapper {

    //查找超级管理员信息
    public SuperManager findSuperManagerInfoById(int managerId);
    //查找超级管理员信息
    public SuperManager findSuperManagerInfoByNameAndPassword(String name , String password);
    //查找管理员登录记录
    public List<ManagerHistory> findManagerHistoryById(int managerId);
    //插入时间和id插入到记录历史表中
    public void insertManagerHistory(int managerId,String date);
}
