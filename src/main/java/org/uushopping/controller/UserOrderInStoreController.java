package org.uushopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.uushopping.pojo.User;
import org.uushopping.pojo.UserOrderInStore;
import org.uushopping.service.IUserOrderInStoreService;
import org.uushopping.service.impl.Ifunclmpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/userOrderInStoreController")
public class UserOrderInStoreController {
    static double sum=0;
    static double allSum=0;
    static  String orderId;
    @Autowired
    IUserOrderInStoreService iUserOrderInStoreService;
    @Autowired
    Ifunclmpl ifunclmpl;
    @RequestMapping("/order.do")
    public ModelAndView findAllOrderInStore(HttpSession session, ModelAndView modelAndView, int userId){
        List<UserOrderInStore> userOrderInStores=iUserOrderInStoreService.findAllOrderInStore(userId);
        User user = (User) session.getAttribute("user");
        sum=0;
        for (UserOrderInStore i:userOrderInStores){
            sum =sum+i.getCommodityPrice();
        }
        modelAndView.addObject("user",user);
        modelAndView.addObject("userOrderInStores",userOrderInStores);
        modelAndView.addObject("AllPrice",sum);
        allSum=0;
        allSum =sum+8;
        modelAndView.addObject("allSum",allSum);
        modelAndView.setViewName("order");
        return modelAndView;
    }
    @RequestMapping("/d-success.do")
    public void do_successRequest(HttpServletRequest request, HttpServletResponse response,int userId) throws Exception {
        List<UserOrderInStore> userOrderInStores=iUserOrderInStoreService.findAllOrderInStore(userId);
        HttpSession session = request.getSession();
        for (UserOrderInStore i:userOrderInStores){
            orderId=i.getOrderId();
        }
        session.setAttribute("allSum",allSum);
        session.setAttribute("userOIS",userOrderInStores);
        session.setAttribute("orderId",orderId);
        request.getRequestDispatcher("/WEB-INF/view/d-success.jsp").forward(request, response);
    }
}
