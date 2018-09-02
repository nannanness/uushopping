package org.uushopping.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.uushopping.pojo.Commodity;
import org.uushopping.pojo.User;

import java.util.List;

@Repository
public interface ILogin {
    public User logindo(String isname, String ispassword);
    public int currutUserShopCarNum(int currUserId);
    public int currutUserShopCartel(int currUserId);
    public List<Commodity> curruntUserShopCarInfor(int currUserId);
    public List<Commodity> orderShopCarCommdi( Integer[] ordercommtiId);
    //加入购物车
    public void joinCommodity(int shopCarId,int commodityId);

}
