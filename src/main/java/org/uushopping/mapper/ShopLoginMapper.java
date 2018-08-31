package org.uushopping.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.uushopping.pojo.Store;
public interface ShopLoginMapper {
    public Store ShopLogindo(String storeMan, String storePassword);//商家登录
}
