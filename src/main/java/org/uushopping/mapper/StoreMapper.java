package org.uushopping.mapper;

import org.springframework.stereotype.Repository;
import org.uushopping.pojo.Store;

import java.util.List;
@Repository
public interface StoreMapper {

    public List<Store> getAllStore();

    public void addStore(Store store);

    public List<Store> search(String arg0);

    public String getFlag(int storeId);

    public void setFlag(String flag, int storeId);

}
