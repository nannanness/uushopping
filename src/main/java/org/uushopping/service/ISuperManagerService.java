package org.uushopping.service;

import org.uushopping.pojo.SuperManager;

public interface ISuperManagerService {
    //查询管理员个人信息
    public SuperManager getSuperManagerInfoById(int managerId);
}
