package org.uushopping.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.uushopping.mapper.StoreMapper;
import org.uushopping.pojo.Store;
import org.uushopping.service.IStoreService;

import java.util.List;

@Service
public class StoreServiceImpl implements IStoreService {
    @Autowired
    StoreMapper storeMapper;
    @Override
    public List<Store> getAllStore() {
        List<Store> list = storeMapper.getAllStore();
        return list;
    }
}
