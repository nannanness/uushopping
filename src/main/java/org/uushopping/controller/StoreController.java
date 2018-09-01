package org.uushopping.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.uushopping.pojo.Store;
import org.uushopping.service.IStoreService;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
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

    @RequestMapping("/Shop_list.do")
    public ModelAndView getAllStoreForShop(ModelAndView modelAndView){
        List<Store> list = storeService.getAllStore();
        modelAndView.setViewName("Shop_list");
        modelAndView.addObject("list" , list);
        return modelAndView;
    }

    @RequestMapping("/add_store.do")
    public ModelAndView addStore(ModelAndView modelAndView, @RequestParam String storeName,@RequestParam String storeMan, @RequestParam String storePassword, @RequestParam String storePassword2, @RequestParam String storePhone, @RequestParam String storeEmail, @RequestParam String storeIntroduction){
        Store store = new Store();
        store.setStoreName(storeName);
        store.setStoreMan(storeMan);
        store.setStorePassword(storePassword);
        store.setStorePhone(storePhone);
        store.setStoreEmail(storeEmail);
        store.setStoreIntroduction(storeIntroduction);
        storeService.addStore(store);
        getAllStore(modelAndView);
        return modelAndView;
    }

    @RequestMapping("/search.do")
    public ModelAndView search(ModelAndView modelAndView , @RequestParam("text") String arg0 ){
        List<Store> list = storeService.search(arg0);
        modelAndView.setViewName("administrator");
        modelAndView.addObject("list" , list);
        return modelAndView;
    }

    @RequestMapping("/pass.do")
    public void pass(HttpServletResponse response , @RequestParam("storeId") int storeId) throws IOException {
        PrintWriter out = response.getWriter();
        String newFlag = storeService.getFlag(storeId);
        System.out.println(storeId + "id=============pass");
        System.out.println(storeId);
        if("审核中".equals(newFlag) || "挂起".equals(newFlag)){
            storeService.setFlag("已通过", storeId);
            out.write(toJsonStr());
        }
    }

    @RequestMapping("/hang.do")
    public void hang(HttpServletResponse response , @RequestParam("storeId") int storeId) throws IOException {
        PrintWriter out = response.getWriter();
        String newFlag = storeService.getFlag(storeId);
        System.out.println(storeId + "id=============hang");
        if("已通过".equals(newFlag)){
            storeService.setFlag("挂起", storeId);
            out.write(toJsonStr());
        }
    }

    @RequestMapping("/Obtained.do")
    public void Obtained(HttpServletResponse response , @RequestParam("storeId") int storeId) throws IOException {
        PrintWriter out = response.getWriter();
        String newFlag = storeService.getFlag(storeId);
        System.out.println(storeId + "id=============ob");
        if(!"已下架".equals(newFlag)){
            storeService.setFlag("已下架", storeId);
            out.write(toJsonStr());
        }
    }

    public String toJsonStr(){
        JSONObject json = JSONObject.parseObject("{\"flag\":\"true\"}");
        String strJson = json.toJSONString();
        return strJson;
    }
}
