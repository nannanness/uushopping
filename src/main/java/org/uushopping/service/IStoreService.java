package org.uushopping.service;

import org.uushopping.pojo.Store;

import java.util.List;

public interface IStoreService {

    public List<Store> getAllStore();

    public void addStore(Store store);

    public List<Store> search(String arg0);
}
