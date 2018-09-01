package org.uushopping.service;

import org.uushopping.pojo.Store;

import java.util.List;

public interface IStoreService {

    public List<Store> getAllStore();
    //通过用户名查询是否存在该用户
    public Store ifExist(String storeMan);
    public void addStore(Store store);

    public List<Store> search(String arg0);

    public String getFlag(int storeId);

    public void setFlag(String flag, int storeId);
}
