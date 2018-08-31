package org.uushopping.controller;

import org.apache.ibatis.annotations.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.uushopping.pojo.ManagerHistory;
import org.uushopping.pojo.SuperManager;
import org.uushopping.service.ISuperManagerService;
import org.uushopping.service.impl.SuperManagerServiceImpl;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/supermanager")
public class SuperManagerController {
    @Autowired
    ISuperManagerService service;
    @RequestMapping("/admin-info.do")
    public ModelAndView superManager(HttpSession session, ModelAndView modelAndView) throws ParseException {
        SuperManager superManager = service.getSuperManagerInfoById(1);
        int managerId = (int) session.getAttribute("managerId");
        System.out.println(managerId);
        List<ManagerHistory> mhList = service.findManagerHistoryByID(managerId);
        System.out.println(mhList);
        modelAndView.addObject("manager",superManager);
        modelAndView.addObject("mh",mhList);
        Date date = new Date();
        String simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        session.setAttribute("date",simple);
        modelAndView.setViewName("admin_info");
        return modelAndView;
    }

}
