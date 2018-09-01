package org.uushopping.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.uushopping.mapper.SuperManagerMapper;
import org.uushopping.pojo.ManagerHistory;
import org.uushopping.pojo.SuperManager;
import org.uushopping.service.ISuperManagerService;

import java.util.List;

@Service
public class SuperManagerServiceImpl implements ISuperManagerService {
    @Autowired
    SuperManagerMapper superManagerMapper;
    @Override
    public SuperManager getSuperManagerInfoById(int managerId) {
        return superManagerMapper.findSuperManagerInfoById(managerId);
    }

    @Override
    public SuperManager findSuperManagerInfoByNameAndPassword(String name, String password) {
        return superManagerMapper.findSuperManagerInfoByNameAndPassword(name,password);
    }

    @Override
    public void updateSM(String name,String phone, String email, String qq,int id) {
        superManagerMapper.updateSuperManager(name, phone, email, qq,id);
    }

    @Override
    public List<ManagerHistory> findManagerHistoryByID(int managerId) {
        return superManagerMapper.findManagerHistoryById(managerId);
    }

    @Override
    public void insertManagerHistory(int managerId, String loginDate) {
        superManagerMapper.insertManagerHistory(managerId,loginDate);
    }



}
