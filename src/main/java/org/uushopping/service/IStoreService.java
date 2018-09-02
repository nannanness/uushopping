package org.uushopping.service;

import org.apache.ibatis.annotations.Select;
import org.uushopping.pojo.Commodity_Image;
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

    //寻找商品对应的店铺
    public Store findStoreById(int storeId);

}
