package org.uushopping.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.uushopping.pojo.Commodity;
import org.uushopping.pojo.Store;
import org.uushopping.service.ICommodityService;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ICommodityService commodityService;

    @RequestMapping("/Products_List.do")
    public ModelAndView toProductsList(ModelAndView modelAndView){
        List<Commodity> list = commodityService.getAllCommodity();
        modelAndView.setViewName("Products_List");
        modelAndView.addObject("list",list);
        return modelAndView;
    }

    @RequestMapping("/search.do")
    public ModelAndView search(ModelAndView modelAndView , @RequestParam("text") String arg0){
        List<Commodity> list = commodityService.search(arg0);
        modelAndView.setViewName("Products_List");
        modelAndView.addObject("list" , list);
        return modelAndView;
    }

    @RequestMapping("/pass.do")
    public void pass(HttpServletResponse response , @RequestParam("commodityId") int commodityId) throws IOException {
        PrintWriter out = response.getWriter();
        String newFlag = commodityService.getFlag(commodityId);
        System.out.println(commodityId + "id=============pass");
        System.out.println(commodityId);
        if("审核中".equals(newFlag) || "挂起".equals(newFlag)){
            commodityService.setFlag("上架中", commodityId);
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
