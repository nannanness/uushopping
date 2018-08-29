package org.uushopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @RequestMapping("/add_store.do")
    public ModelAndView addStore(ModelAndView modelAndView, @RequestParam String storeName, @RequestParam String storePassword, @RequestParam String storePassword2, @RequestParam String storePhone, @RequestParam String storeEmail, @RequestParam String storeIntroduction){
        Store store = new Store();
        store.setStoreName(storeName);
        store.setStorePassword(storePassword);
        store.setStorePhone(storePhone);
        store.setStoreEmail(storeEmail);
        store.setStoreIntroduction(storeIntroduction);
        storeService.addStore(store);
        getAllStore(modelAndView);
        return modelAndView;
    }
}
