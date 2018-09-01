package org.uushopping.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.uushopping.mapper.OrderManagerMapper;
import org.uushopping.pojo.Orders;
import org.uushopping.service.IOrderManagerService;

import java.util.List;
@Service
public class OrderManagerSreviceImpl implements IOrderManagerService {
    @Autowired
    OrderManagerMapper managerMapper;
    @Override
    public List<Orders> getOrdersAll() {
        return managerMapper.findOrderAll();
    }
}
