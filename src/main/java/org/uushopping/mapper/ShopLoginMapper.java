package org.uushopping.mapper;

import org.apache.ibatis.annotations.Mapper;

import org.uushopping.pojo.Orders;
import org.uushopping.pojo.Store;

import java.util.List;

public interface ShopLoginMapper {
    public Store ShopLogindo(String storeMan, String storePassword);//商家登录
    public List<Orders> ShopOrdersAll();
    public void updateOrderStatus(String orderStatus,String ordersExpressDelivery,int orderId);
    public void deleteByOrderId(int OrderId);//删除订单
}
