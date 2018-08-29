package org.uushopping.mapper;

import org.springframework.stereotype.Repository;
import org.uushopping.pojo.SuperManager;
@Repository
public interface SuperManagerMapper {
    //查找超级管理员信息
    public SuperManager findSuperManagerInfoById(int managerId);
}
