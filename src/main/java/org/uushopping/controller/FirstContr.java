package org.uushopping.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class FirstContr {
    //返回首页
    @RequestMapping("/index.do")
    public void indexRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.getRequestDispatcher("index.jsp").forward(request, response);

    }
    //用户登录
    @RequestMapping("/login.do")
    public void loginRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request, response);
    }
    //用户注册
    @RequestMapping("/register.do")
    public void registerRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.getRequestDispatcher("/WEB-INF/view/register.jsp").forward(request, response);
    }
    //我的订单
    @RequestMapping("/my-d.do")
    public void my_dRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.getRequestDispatcher("/WEB-INF/view/my-d.jsp").forward(request, response);
    }
    //我的收藏
    @RequestMapping("/my-s.do")
    public void my_sRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.getRequestDispatcher("/WEB-INF/view/my-s.jsp").forward(request, response);
    }
    //账户信息
    @RequestMapping("/my-user.do")
    public void my_userRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.getRequestDispatcher("/WEB-INF/view/my-user.jsp").forward(request, response);
    }
    //我的评价
    @RequestMapping("/my-p.do")
    public void my_pRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.getRequestDispatcher("/WEB-INF/view/my-p.jsp").forward(request, response);
    }
    //地址管理
    @RequestMapping("/my-add.do")
    public void my_addRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.getRequestDispatcher("/WEB-INF/view/my-add.jsp").forward(request, response);
    }
    //退货申请
    @RequestMapping("/request.do")
    public void requestRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.getRequestDispatcher("/WEB-INF/view/request.jsp").forward(request, response);
    }
    //退款记录
    @RequestMapping("/retreat.do")
    public void retreatRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.getRequestDispatcher("/WEB-INF/view/retreat.jsp").forward(request, response);
    }
    //商城资讯
    @RequestMapping("/new.do")
    public void newRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.getRequestDispatcher("/WEB-INF/view/new.jsp").forward(request, response);
    }
    //提交订单
    @RequestMapping("/order.do")
    public void orderRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.getRequestDispatcher("/WEB-INF/view/order.jsp").forward(request, response);
    }
    //确认下单
    @RequestMapping("/d-success.do")
    public void do_successRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.getRequestDispatcher("/WEB-INF/view/d-success.jsp").forward(request, response);
    }

}
