package org.uushopping.controller;

import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.uushopping.pojo.ManagerHistory;
import org.uushopping.pojo.SuperManager;
import org.uushopping.pojo.User;
import org.uushopping.service.ISuperManagerService;
import org.uushopping.service.ISuperUserService;
import org.uushopping.service.IUserService;
import org.uushopping.service.impl.SuperManagerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/supermanager")
public class SuperManagerController {
    @Autowired
    ISuperManagerService service;
    @Autowired
    IUserService iUserService;
    @Autowired
    ISuperUserService userService;

    @RequestMapping("/admin-info.do")
    public ModelAndView superManager(HttpSession session, ModelAndView modelAndView) throws ParseException {
        //得到超级管理员的记录
        SuperManager smInfo = service.getSuperManagerInfoById(1);
        System.out.println(smInfo);
        //查到管理员登录记录
        int superManagerId = (int) session.getAttribute("superManagerId");
        List<ManagerHistory> mhList = service.findManagerHistoryByID(superManagerId);
        System.out.println(mhList);
        modelAndView.addObject("mm", smInfo);
        modelAndView.addObject("mh", mhList);
        modelAndView.setViewName("admin_info");
        return modelAndView;
    }

    @RequestMapping("/userlist.do")
    public ModelAndView superUser(ModelAndView modelAndView) throws ServletException, IOException {
        // 得到所有用户的信息
        List<User> users = iUserService.getUsers();
        modelAndView.addObject("ul", users);
        modelAndView.setViewName("user_list");
        return modelAndView;
    }

    @RequestMapping("/ajax.do")
    public void ajaxTest(HttpServletResponse response, ModelAndView modelAndView, @RequestParam("userId") int userid) throws IOException {
        PrintWriter writer = response.getWriter();
        System.out.println(userid);
        User user = userService.selectUser(userid);
        //得到用户的状态
        String userFlag = user.getUserFlag();
        if ("已启用".equals(userFlag)) {
            userService.updateUser("已停用", userid);
            JSONObject json = JSONObject.parseObject("{\"userFlag\":\"stop\"}");
            String strJson = json.toJSONString();
            writer.write(strJson);
        }
    }
}

