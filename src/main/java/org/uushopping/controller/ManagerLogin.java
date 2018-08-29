package org.uushopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.uushopping.mapper.SuperManagerMapper;
import org.uushopping.pojo.SuperManager;

import javax.annotation.Resource;

@Controller
@RequestMapping("/managerLogin")
public class ManagerLogin {
    @Autowired
    SuperManagerMapper superManagerMapper;

    @RequestMapping("/sideIn.do")
    public ModelAndView sideIn(ModelAndView modelAndView , @RequestParam("name") String name , @RequestParam("password") String password){
        SuperManager superManager = superManagerMapper.findSuperManagerInfoByNameAndPassword(name,password);
        if (superManager != null){
            modelAndView.setViewName("index-system");
        }
        return modelAndView;
    }
}
