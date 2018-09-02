package org.uushopping.service;

import org.uushopping.pojo.UserOrderInStore;

import java.util.List;

public interface IUserOrderInStoreService {
    public List<UserOrderInStore> findAllOrderInStore(int userId);
}
