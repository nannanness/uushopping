package org.uushopping.service;


import org.uushopping.pojo.Commodity;
import org.uushopping.pojo.User;

import java.util.List;

public interface Ifunc {
    //登录功能的实现
    public User funLogin(String getuser, String getPasswd) throws Exception;
    //当前用户购物车里的商品数量
    public int funCurrUserShopCarCommdiNun(int getuserid);
    //当前用户购物车里的商品信息
    public List<Commodity> funCurrUserShopCarCommdiInfor(int getuserid);
    //当前用户购物车的编号
    public int funCurrUserShopCarNum(int getuserid);
}
