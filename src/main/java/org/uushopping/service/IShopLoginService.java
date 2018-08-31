package org.uushopping.service;

import org.uushopping.pojo.Store;

public interface IShopLoginService {
    //登录功能的实现
    public Store shopLogin(String getshopMan, String getPasswd);
}
