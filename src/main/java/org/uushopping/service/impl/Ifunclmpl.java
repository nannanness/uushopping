package org.uushopping.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.uushopping.mapper.ILogin;
import org.uushopping.pojo.Commodity;
import org.uushopping.pojo.User;
import org.uushopping.service.Ifunc;

import javax.annotation.Resource;
import java.util.List;

@Service
@ContextConfiguration(locations = "classpath:spring-mybatis.xml")
public class Ifunclmpl implements Ifunc {

   @Autowired
   ILogin iLogin;

    @Override
    public User funLogin(String getuser, String getPasswd){
        return iLogin.logindo(getuser,getPasswd);
    }

    @Override
    public int funCurrUserShopCarCommdiNun(int getuserid) {
        return iLogin.currutUserShopCarNum(getuserid);
    }

    @Override
    public List<Commodity> funCurrUserShopCarCommdiInfor(int getuserid) {
        return iLogin.curruntUserShopCarInfor(getuserid);
    }

    @Override
    public int funCurrUserShopCarNum(int getuserid) {
        return iLogin.currutUserShopCartel(getuserid);
    }
}
