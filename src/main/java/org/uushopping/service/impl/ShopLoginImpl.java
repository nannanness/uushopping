package org.uushopping.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.uushopping.mapper.ShopLoginMapper;
import org.uushopping.pojo.Orders;
import org.uushopping.pojo.Store;
import org.uushopping.service.IShopLoginService;

import java.util.List;

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

    @Override
    public List<Orders> ShopOrdersAll() {
        List<Orders> orders = shopLoginMapper.ShopOrdersAll();
        return orders;
    }

    @Override
    public void updateOrderStatus(String orderStatus, String ordersExpressDeliveryint, int orderId) {
        shopLoginMapper.updateOrderStatus(orderStatus,ordersExpressDeliveryint,orderId);
    }

    @Override
    public void deleteByOrderId(int orderId) {
        shopLoginMapper.deleteByOrderId(orderId);
    }

//    @Override
//    public void updateOrderStatus(String orderStatus, String ordersExpressDelivery,int orderId) {
//        shopLoginMapper.updateOrderStatus(orderStatus,ordersExpressDelivery,orderId);
//    }
}
