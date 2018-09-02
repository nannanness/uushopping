package org.uushopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.uushopping.pojo.Commodity;
import org.uushopping.pojo.CommodityImage;
import org.uushopping.pojo.Commodity_Image;
import org.uushopping.pojo.Store;
import org.uushopping.service.ICommodityService;
import org.uushopping.service.IStoreService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/ClassCommodityController")
public class ClassCommodityController {
    @Autowired
    ICommodityService commodityService;
    @Autowired
    IStoreService storeService;

    @RequestMapping("/all-class.do")
    public ModelAndView getClassCommodity(ModelAndView modelAndView, @RequestParam("commodityType") String commodityType){
        List<Commodity_Image> list = null;
        List<Store> storeList = new ArrayList<>();
        List<Integer> storeIdList = null;
        if("all".equals(commodityType)){
            list = commodityService.getALLCommodity_Image();
            storeList = storeService.getAllStore();
            commodityType = "全部商品";
        }else {
            list = commodityService.getCommodity_Image(commodityType);
            storeIdList = commodityService.getStoreByClass(commodityType);
            for(int i : storeIdList){
                storeList.add(storeService.findStoreById(i));
            }
        }

        modelAndView.addObject("list" , list);
        modelAndView.addObject("storeList" , storeList);
        modelAndView.addObject("oneClass" , commodityType);
        modelAndView.setViewName("all-class");
        return modelAndView;
    }

}
