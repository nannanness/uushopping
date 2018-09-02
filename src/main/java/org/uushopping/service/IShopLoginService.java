package org.uushopping.service;

import org.uushopping.pojo.Orders;
import org.uushopping.pojo.Store;

import java.util.List;

public interface IShopLoginService {
    //登录功能的实现
    public Store shopLogin(String getshopMan, String getPasswd);
//    订单搜索所有
    public List<Orders> ShopOrdersAll();
//    订单发货
    public void updateOrderStatus(String orderStatus,String ordersExpressDeliveryint ,int orderId);
//    订单删除
    public void deleteByOrderId(int orderId);
}
