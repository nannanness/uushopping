package org.uushopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.uushopping.pojo.SuperManager;
import org.uushopping.service.ISuperManagerService;
import org.uushopping.service.impl.SuperManagerServiceImpl;

@Controller
@RequestMapping("/supermanager")
public class SuperManagerController {
    @Autowired
    ISuperManagerService service;
    @RequestMapping("/admin-info.do")
    public ModelAndView superManager(ModelAndView modelAndView){
        ModelAndView modelAndView1;
        SuperManager superManager = service.getSuperManagerInfoById(1);
        modelAndView.addObject("manager",superManager);
        modelAndView.setViewName("admin_info");
        return modelAndView;
    }
}
