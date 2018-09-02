package org.uushopping.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.uushopping.pojo.Commodity;
import org.uushopping.pojo.Orders;
import org.uushopping.pojo.Store;
import org.uushopping.service.*;
import org.uushopping.service.impl.ShopLoginImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
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
    @RequestMapping("/order_handling-business.do")
    public ModelAndView ShopOrdersAll(ModelAndView modelAndView){
        List<Orders> orderBusiness=iShopLoginService.ShopOrdersAll();
        modelAndView.addObject("OrdersBusiness",orderBusiness);
        modelAndView.setViewName("Order_handling-business");

        return modelAndView;
    }
    @RequestMapping("/Refund-business.do")
    public ModelAndView ShopOrdersAllRefund(ModelAndView modelAndView){
        List<Orders> orderBusiness=iShopLoginService.ShopOrdersAll();
        for (Orders i:orderBusiness){
            System.out.println(i);
        }

        modelAndView.addObject("RefundBusiness",orderBusiness);
        modelAndView.setViewName("Refund-business");

        return modelAndView;
    }
    @RequestMapping("/updateOrderStatus.do")
    public  ModelAndView updateOrderStatus(ModelAndView modelAndView,String orderStatus,String ordersExpressDezlivery,int orderId){
        System.out.println(orderStatus+"++++++++"+ordersExpressDezlivery+"++++++++"+orderId);
        iShopLoginService.updateOrderStatus(orderStatus,ordersExpressDezlivery,orderId);
        List<Orders> orderBusiness=iShopLoginService.ShopOrdersAll();
        modelAndView.addObject("OrdersBusiness",orderBusiness);
        modelAndView.setViewName("Order_handling-business");
        return modelAndView;
    }
    @RequestMapping("/delete.do")
    public ModelAndView detele(ModelAndView modelAndView,int orderId){
        iShopLoginService.deleteByOrderId( orderId);
        List<Orders> orderBusiness=iShopLoginService.ShopOrdersAll();
        modelAndView.addObject("OrdersBusiness",orderBusiness);
        modelAndView.setViewName("Order_handling-business");
        return modelAndView;
    }
    @Autowired
    IOrderManagerService service;
    @Autowired
    ISuperManagerService superManagerService;
    @RequestMapping("/order.do")
    public ModelAndView order(ModelAndView modelAndView){
        List<Orders> list = service.getOrdersAll();
        superManagerService.findManagerHistoryByID(1);
        int sum = service.sumOrderCount();
        System.out.println(sum);
        modelAndView.addObject("orderBusinessList",list);
        modelAndView.addObject("sumCountBusiness",sum);
        modelAndView.setViewName("Amounts-business");
        Date date = new Date();
        String sql = new SimpleDateFormat("yyyy-MM-dd").format(date);
        modelAndView.addObject("dateNew",sql);
        return modelAndView;
    }

    @Autowired
    ICommodityService commodityService;

    @RequestMapping("/Products_List-business.do")
    public ModelAndView toProductsList(ModelAndView modelAndView){
        List<Commodity> list = commodityService.getAllCommodity();
//        for (Commodity l:list){
//            System.out.println(l);
//        }
        modelAndView.setViewName("Products_List-business");
        modelAndView.addObject("Businesslist",list);
        return modelAndView;
    }

    @RequestMapping("/search.do")
    public ModelAndView search(ModelAndView modelAndView , @RequestParam("text") String arg0){
        List<Commodity> list = commodityService.search(arg0);
        modelAndView.setViewName("Products_List-business");
        modelAndView.addObject("Businesslist" , list);
        return modelAndView;
    }

    @RequestMapping("/pass.do")
    public void pass(HttpServletResponse response , @RequestParam("commodityId") int commodityId) throws IOException {
        PrintWriter out = response.getWriter();
        String newFlag = commodityService.getFlag(commodityId);
        System.out.println(commodityId + "id=============pass");
        System.out.println(commodityId);
        if("审核中".equals(newFlag) || "挂起".equals(newFlag)){
            out.write(toJsonStr());
        }
    }

    @RequestMapping("/hang.do")
    public void hang(HttpServletResponse response , @RequestParam("commodityId") int commodityId) throws IOException {
        PrintWriter out = response.getWriter();
        String newFlag = commodityService.getFlag(commodityId);
        System.out.println(commodityId + "id=============hang");
        if("上架中".equals(newFlag)){
            commodityService.setFlag("挂起", commodityId);
            out.write(toJsonStr());
        }
    }

    @RequestMapping("/Obtained.do")
    public void Obtained(HttpServletResponse response , @RequestParam("commodityId") int commodityId) throws IOException {
        PrintWriter out = response.getWriter();
        String newFlag = commodityService.getFlag(commodityId);
        System.out.println(commodityId + "id=============ob");
        if(!"已下架".equals(newFlag)){
            commodityService.setFlag("已下架", commodityId);
            out.write(toJsonStr());
        }
    }

    public String toJsonStr(){
        JSONObject json = JSONObject.parseObject("{\"flag\":\"true\"}");
        String strJson = json.toJSONString();
        return strJson;
    }
}
