package org.uushopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.uushopping.pojo.Store;
import org.uushopping.service.IShopLoginService;
import org.uushopping.service.impl.ShopLoginImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/shopController")
public class ShopController {

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
