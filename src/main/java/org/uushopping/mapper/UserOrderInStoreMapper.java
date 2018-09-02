package org.uushopping.mapper;

import org.springframework.stereotype.Repository;
import org.uushopping.pojo.UserOrderInStore;

import java.util.List;
@Repository
public interface UserOrderInStoreMapper {
    public List<UserOrderInStore> findAllOrderInStore(int userId);
}
