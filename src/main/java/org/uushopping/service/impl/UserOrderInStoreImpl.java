package org.uushopping.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.uushopping.mapper.UserOrderInStoreMapper;
import org.uushopping.pojo.UserOrderInStore;
import org.uushopping.service.IUserOrderInStoreService;

import java.util.List;
@Service
public class UserOrderInStoreImpl implements IUserOrderInStoreService {
    @Autowired
    UserOrderInStoreMapper userOrderInStoreMapper;
    @Override
    public List<UserOrderInStore> findAllOrderInStore(int userId) {
        List<UserOrderInStore> userOrderInStoreList=userOrderInStoreMapper.findAllOrderInStore(userId);
        return userOrderInStoreList;
    }
}
