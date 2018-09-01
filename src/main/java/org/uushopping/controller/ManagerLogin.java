package org.uushopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.uushopping.mapper.SuperManagerMapper;
import org.uushopping.pojo.SuperManager;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/managerLogin")
@SessionAttributes("superManagerId")
public class ManagerLogin {
    @Autowired
    SuperManagerMapper superManagerMapper;

    @RequestMapping("/sideIn.do")
    public ModelAndView sideIn(HttpSession session,ModelAndView modelAndView , @RequestParam("name") String name , @RequestParam("password") String password){
        SuperManager superManager = superManagerMapper.findSuperManagerInfoByNameAndPassword(name,password);
        if (superManager != null){
            Date date = new Date();
            String sql = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
            modelAndView.addObject("supermanager",superManager);
            modelAndView.setViewName("index-system");
            int superMangerId = superManager.getManagerId();
            session.setAttribute("managerId",superMangerId);
            System.out.println(superMangerId);
            superManagerMapper.insertManagerHistory(superManager.getManagerId(),sql);
        }
        return modelAndView;
    }
}
