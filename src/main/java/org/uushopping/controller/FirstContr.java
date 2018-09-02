package org.uushopping.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.uushopping.pojo.Commodity;
import org.uushopping.pojo.HotCommodity;
import org.uushopping.pojo.User;
import org.uushopping.service.ICommodityService;
import org.uushopping.service.Ifunc;
import org.uushopping.service.impl.Carousel_mapServiceImpl;
import org.uushopping.service.impl.CommodityServiceImpl;


import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.bind.Element;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Controller
public class FirstContr {
    //注入商品的服务
    @Autowired
    CommodityServiceImpl commodityService;
    //轮播图
    @Autowired
    Carousel_mapServiceImpl carousel_mapService;

    //返回首页
    @RequestMapping("/index.do")
    public void indexRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.getRequestDispatcher("index.jsp").forward(request, response);

    }
    //获取首页的数据
    @RequestMapping("/getDataIndex.do")
    public void getDataIndex(HttpServletRequest request){
        HttpSession session = request.getSession();
        //页面上的分类
        List<String> commoditycypes = commodityService.getCommodityType();
        //轮播图
        List<String> adMaps = carousel_mapService.getIndexMap();
        //热卖区商品
        List<HotCommodity>hotCommodities = commodityService.selectHotCommodity();
        //鞋
        List<HotCommodity> shoes = commodityService.selectShoe();

        session.setAttribute("commodityType",commoditycypes);
        session.setAttribute("adMaps",adMaps);
        session.setAttribute("hotCommodities",hotCommodities);
        session.setAttribute("shoes",shoes);
    }
    //实现登录功能
    @Resource
    private Ifunc ifunc;
    @RequestMapping("/funclogin.do")
    public void funclogin(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String isName = request.getParameter("loginname");
        String isPasswd = request.getParameter("nloginpwd");
        User user = ifunc.funLogin(isName, isPasswd);

        HttpSession session = request.getSession();
        session.setAttribute("user",user);
        if (user != null) {
            int uId = user.getUserId();
            int getShopCarCommdiNum = ifunc.funCurrUserShopCarCommdiNun(uId);
            int getShopCarNum = ifunc.funCurrUserShopCarNum(uId);
            session.setAttribute("userimg",user.getUserAvatar());
            session.setAttribute("ShopCarNum",getShopCarNum);
            session.setAttribute("flage", true);
            session.setAttribute("userId",user.getUserId());
            session.setAttribute("CurrUserShopCarCommdiNun",getShopCarCommdiNum);
            session.setAttribute("username", "欢迎用户:" + isName);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } else {
            request.setAttribute("flage","错误");
            request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request, response);

        }
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
    //购物车
    @RequestMapping("/shopcart.do")
    public void shopcartRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
       int isshopNum = Integer.parseInt(request.getParameter("getshopcarnum"));
       List<Commodity> commodity = ifunc.funCurrUserShopCarCommdiInfor(isshopNum);
        HttpSession session = request.getSession();
        session.setAttribute("commodity",commodity);
        request.getRequestDispatcher("/WEB-INF/view/shopcart.jsp").forward(request, response);
    }
    //全部商品
    @RequestMapping("/all-cl.do")
    public void jumpAllCl(HttpServletRequest request ,HttpServletResponse response ) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/view/all-cl.jsp").forward(request,response);
    }
    //用户退出
    @RequestMapping("/logout.do")
    public void logout(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        request.getSession().removeAttribute("username");
        request.getSession().removeAttribute("flage");
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }
    //用户购物车结算功能
    @RequestMapping("/accountcommdi.do")
    public void accountcommdirequse(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        String jsoncheckId =request.getParameter("jsoncheckId");
        String accountprice = request.getParameter("commdiprice");
        String commdinum = request.getParameter("commdinum");
        String[] stringIds = jsoncheckId.split(",");
        Integer[] ints = new Integer[stringIds.length];
        HttpSession session = request.getSession();
        for (int i = 0 ; i<stringIds.length;i++){
            ints[i] = Integer.parseInt(stringIds[i]);
        }
        List<Commodity> ordercommdi = ifunc.funorderShopCarCommdi(ints);
        session.setAttribute("ordercomdi",ordercommdi);
        session.setAttribute("accountprice",accountprice);
        session.setAttribute("commdinum",commdinum);
        request.getRequestDispatcher("/WEB-INF/view/order.jsp").forward(request, response);

    }


}
