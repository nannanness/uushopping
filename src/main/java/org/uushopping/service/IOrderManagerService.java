package org.uushopping.service;

import org.uushopping.pojo.Orders;

import java.util.List;

public interface IOrderManagerService {
    public List<Orders> getOrdersAll();
    public int sumOrderCount();
}
