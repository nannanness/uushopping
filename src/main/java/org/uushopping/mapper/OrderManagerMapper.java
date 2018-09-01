package org.uushopping.mapper;

import org.uushopping.pojo.Orders;

import javax.persistence.criteria.Order;
import java.util.List;

public interface OrderManagerMapper {
    //查询订单信息
    public List<Orders> findOrderAll();
}
