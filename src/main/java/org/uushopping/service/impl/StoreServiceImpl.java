package org.uushopping.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.uushopping.mapper.StoreMapper;
import org.uushopping.pojo.Commodity_Image;
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

    @Override
    public Store ifExist(String storeMan) {
        Store stores = storeMapper.ifExist(storeMan);
        return stores;
    }


    @Override
    public void addStore(Store store) {
        storeMapper.addStore(store);
    }

    @Override
    public List<Store> search(String arg0) {
        return storeMapper.search(arg0);
    }

    @Override
    public String getFlag(int storeId) {
        return storeMapper.getFlag(storeId);
    }

    @Override
    public void setFlag(String flag, int storeId) {
        storeMapper.setFlag(flag, storeId);
    }

    @Override
    public Store findStoreById(int storeId) {
        Store store = storeMapper.selectStoreById(storeId);
        return store;
    }
}
