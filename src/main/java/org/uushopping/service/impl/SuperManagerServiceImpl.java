package org.uushopping.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.uushopping.mapper.SuperManagerMapper;
import org.uushopping.pojo.SuperManager;
import org.uushopping.service.ISuperManagerService;
@Service("superManager")
public class SuperManagerServiceImpl implements ISuperManagerService {
    @Autowired
    SuperManagerMapper superManagerMapper;
    @Override
    public SuperManager getSuperManagerInfoById(int managerId) {
        System.out.println(superManagerMapper);
        return superManagerMapper.findSuperManagerInfoById(managerId);
    }
}
