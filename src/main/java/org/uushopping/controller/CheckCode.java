package org.uushopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.uushopping.mapper.UserMapper;
import org.uushopping.pojo.User;
import org.uushopping.service.IUserService;
import org.uushopping.utils.NumCheck;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
@RequestMapping("/check")
//@SessionAttributes(value = "register_checkCode")
public class CheckCode {
    @Autowired
    IUserService iUserService ;
    //判断用户注册的时候是否注册过
    @RequestMapping(value = "/username.do")
    public void checkPhoneNum(@RequestParam("usernamaText") String usernamaText, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=utf-8");
        User user = iUserService.ifExist(usernamaText);
        if(usernamaText==null || usernamaText.equals("")){
            response.getWriter().write("账号不能为空");
        }else {
            if(user ==null){
                response.getWriter().write("可以使用");
            }else {
                response.getWriter().write("该用户名已经注册过了");
            }
        }
    }
    @RequestMapping(value = "/phoneNum.do")
    public void checkpohne(@RequestParam("phoneText") String phoneText, HttpServletResponse response) throws IOException {
            List<User> users = iUserService.getUsers();
            boolean flag = true;
            for(User u:users){
                if(u.getUserPhone().equals(phoneText)){
                    flag=false;
                }
            }
            if(flag){
                response.getWriter().write("true");
            }

    }
    //获取验证码
    @RequestMapping(value = "/addCheckCode.do")
    public void addCheckCode(HttpServletResponse response,Model model) throws IOException {
        String num = NumCheck.getNumCheck().toString();//获取验证码
        response.getWriter().write(num);
    }
    //注册用户
    @RequestMapping("/register.do")
    public void registerUser(HttpServletRequest request, HttpServletResponse response){
        String username = request.getParameter("usernameText");
        String password = request.getParameter("passwordText");
        String phone = request.getParameter("getphone");
        iUserService.addUser(username,password,phone);

    }

}
