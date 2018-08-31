package org.uushopping.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.uushopping.mapper.ShopLoginMapper;
import org.uushopping.pojo.Store;
import org.uushopping.service.IShopLoginService;

@Service
//@ContextConfiguration(locations = "classpath:spring-mybatis.xml")
public class ShopLoginImpl implements IShopLoginService {
    @Autowired
    ShopLoginMapper shopLoginMapper;
    @Override
    public Store shopLogin(String getshopMan, String getPasswd){
        Store store=shopLoginMapper.ShopLogindo(getshopMan,getPasswd);
        return store;
    }
}
