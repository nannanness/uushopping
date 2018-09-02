package org.uushopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.uushopping.pojo.Orders;
import org.uushopping.pojo.SuperManager;
import org.uushopping.service.IOrderManagerService;
import org.uushopping.service.ISuperManagerService;

import javax.resource.spi.AuthenticationMechanism;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RequestMapping("/ordermanager")
@Controller
public class OrderController {
    @Autowired
    IOrderManagerService service;
    @Autowired
    ISuperManagerService superManagerService;
    @RequestMapping("/order.do")
    public ModelAndView order(ModelAndView modelAndView){
        List<Orders> list = service.getOrdersAll();
        superManagerService.findManagerHistoryByID(1);
        int sum = service.sumOrderCount();
        modelAndView.addObject("orderList",list);
        modelAndView.addObject("sumCount",sum);
        modelAndView.setViewName("Amounts");
        Date date = new Date();
        String sql = new SimpleDateFormat("yyyy-MM-dd").format(date);
        modelAndView.addObject("dateNew",sql);
        return modelAndView;
    }
}
