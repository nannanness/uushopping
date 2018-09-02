package org.uushopping.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.uushopping.pojo.Store;

import java.util.List;
@Repository
public interface StoreMapper {
    public Store ifExist(String storeMan);

    public List<Store> getAllStore();

    public void addStore(Store store);

    public List<Store> search(String arg0);

    public String getFlag(int storeId);

    public void setFlag(String flag, int storeId);

    //寻找商品对应的店铺
    @Select("SELECT * from store where storeId =#{arg0};")
    public Store selectStoreById(int storeId);

}
