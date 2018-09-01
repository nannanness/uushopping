package org.uushopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.uushopping.pojo.Store;
import org.uushopping.service.IShopLoginService;
import org.uushopping.service.IStoreService;
import org.uushopping.service.impl.ShopLoginImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/shopController")
public class ShopController {
    @Autowired
    IStoreService iStoreService;
    //判断用户注册的时候是否注册过
    @RequestMapping("/storeMan.do")
    public void checkPhoneNum(@RequestParam("storeManText") String storeManText, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=utf-8");
        Store store = iStoreService.ifExist(storeManText);
        if(storeManText==null || storeManText.equals("")){
            response.getWriter().write("账号不能为空");
        }else {
            if(store ==null){
                response.getWriter().write("可以使用");
            }else {
                response.getWriter().write("该名已经注册过了");
            }
        }
    }
    @RequestMapping(value = "/phoneNum.do")
    public void checkpohne(@RequestParam("phoneText") String phoneText, HttpServletResponse response) throws IOException {
        List<Store> store = iStoreService.getAllStore();
        boolean flag = true;
        for(Store u:store){
            if(u.getStorePhone().equals(phoneText)){
                flag=false;
                response.getWriter().write("false");
                System.out.println(flag);
            }
        }
        if(flag){
            response.getWriter().write("true");
        }

    }

    @RequestMapping("/login-business.do")
    public ModelAndView sideIn(ModelAndView modelAndView  ){
//       Store shopLogin=iShopLoginService.shopLogin(name,password);
//        System.out.println(name+"++++++"+password);
//       if (shopLogin!=null){
//        request.setAttribute("name",name);
//        request.setAttribute("pwd",pwd);

           modelAndView.setViewName("login-business");
////           modelAndView.addObject("shopUser",shopLogin);
//       }

        return modelAndView;
    }
    @RequestMapping("/register-business.do")
    public  ModelAndView getShopUser(ModelAndView modelAndView){
        modelAndView.setViewName("register-business");
        return modelAndView;
    }
    @Autowired
    IShopLoginService iShopLoginService;
    @RequestMapping("/index-business.do")
    public ModelAndView jumpIn(HttpServletRequest request,HttpServletResponse response,ModelAndView modelAndView, String businessname,@RequestParam("businesspwd") String pwd){

//        System.out.println(name+"+++"+pwd);
        Store shopLogin=iShopLoginService.shopLogin(businessname,pwd);
        System.out.println(shopLogin);
        if (shopLogin!=null){
            modelAndView.setViewName("index-business");
            modelAndView.addObject("shoplogin",shopLogin);
        }else {
            modelAndView.setViewName("login-business");

        }

        return modelAndView;
    }
}
