package org.uushopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.uushopping.pojo.Store;
import org.uushopping.service.IStoreService;

import java.util.List;

@Controller
@RequestMapping("/storeController")
public class StoreController {
    @Autowired
    IStoreService storeService;

    @RequestMapping("/administrator.do")
    public ModelAndView getAllStore(ModelAndView modelAndView){
        List<Store> list = storeService.getAllStore();
        modelAndView.setViewName("administrator");
        modelAndView.addObject("list" , list);
        return modelAndView;
    }
}
