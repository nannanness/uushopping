package org.uushopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.uushopping.pojo.SuperManager;
import org.uushopping.service.ISuperManagerService;

@Controller
@RequestMapping("/pageJump")
public class PageJump {
    @Autowired
    ISuperManagerService superManagerService;
    @RequestMapping("/index-system.do")
    public ModelAndView toManager(ModelAndView modelAndView){
        modelAndView.setViewName("index-system");
        System.out.println("----------index-system----------");
        return modelAndView;
    }

    @RequestMapping("/home.do")
    public ModelAndView toHome(ModelAndView modelAndView){
        modelAndView.setViewName("home");
        System.out.println("----------home----------");
        return modelAndView;
    }

    @RequestMapping("/Systems.do")
    public ModelAndView toSystems(ModelAndView modelAndView){
        modelAndView.setViewName("Systems");
        System.out.println("----------Systems----------");
        return modelAndView;
    }

    @RequestMapping("/admin_info.do")
    public ModelAndView toAdminInfo(ModelAndView modelAndView){
        modelAndView.setViewName("admin_info");
        System.out.println("admin_info");
        SuperManager superManager = superManagerService.getSuperManagerInfoById(1);
        System.out.println(superManager);
        return modelAndView;
    }

    @RequestMapping("/Products_List.do")
    public ModelAndView toProductsList(ModelAndView modelAndView){
        modelAndView.setViewName("Products_List");
        return modelAndView;
    }

    @RequestMapping("/Category_Manage.do")
    public ModelAndView toCategoryManage(ModelAndView modelAndView){
        modelAndView.setViewName("Category_Manage");
        return modelAndView;
    }

    @RequestMapping("/advertising.do")
    public ModelAndView toAdvertising(ModelAndView modelAndView){
        modelAndView.setViewName("advertising");
        return modelAndView;
    }

    @RequestMapping("/transaction.do")
    public ModelAndView toTransaction(ModelAndView modelAndView){
        modelAndView.setViewName("transaction");
        return modelAndView;
    }

    @RequestMapping("/Order_Chart.do")
    public ModelAndView toOrderChart(ModelAndView modelAndView){
        modelAndView.setViewName("Order_Chart");
        return modelAndView;
    }

    @RequestMapping("/Amounts.do")
    public ModelAndView toAmounts(ModelAndView modelAndView){
        modelAndView.setViewName("Amounts");
        return modelAndView;
    }

    @RequestMapping("/Order_handling.do")
    public ModelAndView toOrderHandling(ModelAndView modelAndView){
        modelAndView.setViewName("Order_handling");
        return modelAndView;
    }

    @RequestMapping("/Refund.do")
    public ModelAndView toRefund(ModelAndView modelAndView){
        modelAndView.setViewName("Refund");
        return modelAndView;
    }

    @RequestMapping("/payment_method.do")
    public ModelAndView toPaymentMethod(ModelAndView modelAndView){
        modelAndView.setViewName("payment_method");
        return modelAndView;
    }

    @RequestMapping("/user_list.do")
    public ModelAndView toUserList(ModelAndView modelAndView){
        modelAndView.setViewName("user_list");
        return modelAndView;
    }

    @RequestMapping("/integration.do")
    public ModelAndView toIntegration(ModelAndView modelAndView){
        modelAndView.setViewName("integration");
        return modelAndView;
    }

    @RequestMapping("/Shop_list.do")
    public ModelAndView toShopList(ModelAndView modelAndView){
        modelAndView.setViewName("Shop_list");
        return modelAndView;
    }

    @RequestMapping("/Shops_Audit.do")
    public ModelAndView toShopsAudit(ModelAndView modelAndView){
        modelAndView.setViewName("Shops_Audit");
        return modelAndView;
    }

    @RequestMapping("/article_list.do")
    public ModelAndView toArticleList(ModelAndView modelAndView){
        modelAndView.setViewName("article_list");
        return modelAndView;
    }

    @RequestMapping("/article_Sort.do")
    public ModelAndView toArticleSort(ModelAndView modelAndView){
        modelAndView.setViewName("article_Sort");
        return modelAndView;
    }

    @RequestMapping("/System_section.do")
    public ModelAndView toSystemSection(ModelAndView modelAndView){
        modelAndView.setViewName("System_section");
        return modelAndView;
    }

    @RequestMapping("/System_Logs.do")
    public ModelAndView toSystemLogs(ModelAndView modelAndView){
        modelAndView.setViewName("System_Logs");
        return modelAndView;
    }

    @RequestMapping("/administrator.do")
    public ModelAndView toAdministrator(ModelAndView modelAndView){
        modelAndView.setViewName("administrator");
        return modelAndView;
    }
    @RequestMapping("/login-system.do")
    public ModelAndView toLoginSystem(ModelAndView modelAndView){
        modelAndView.setViewName("login-system");
        return modelAndView;
    }

    @RequestMapping("/picture-add.do")
    public ModelAndView toPictureAdd(ModelAndView modelAndView){
        modelAndView.setViewName("picture-add");
        return modelAndView;
    }

    @RequestMapping("/article_add.do")
    public ModelAndView toArticleAdd(ModelAndView modelAndView){
        modelAndView.setViewName("article_add");
        return modelAndView;
    }


    @RequestMapping("/Competence.do")
    public ModelAndView toCompetence(ModelAndView modelAndView){
        modelAndView.setViewName("Competence");
        return modelAndView;
    }

    @RequestMapping("/product-category-add.do")
    public ModelAndView toProductCategoryAdd(ModelAndView modelAndView){
        modelAndView.setViewName("product-category-add");
        return modelAndView;
    }

    @RequestMapping("/index-business.do")
    public ModelAndView toIndexBusiness(ModelAndView modelAndView){
        modelAndView.setViewName("index-business");
        return modelAndView;
    }

    @RequestMapping("/order_detailed.do")
    public ModelAndView toOrderDetailed(ModelAndView modelAndView){
        modelAndView.setViewName("order_detailed");
        return modelAndView;
    }

    @RequestMapping("/Payment_details.do")
    public ModelAndView toPaymentDetails(ModelAndView modelAndView){
        modelAndView.setViewName("Payment_details");
        return modelAndView;
    }

    @RequestMapping("/Refund_detailed.do")
    public ModelAndView toRefundDetailed(ModelAndView modelAndView){
        modelAndView.setViewName("Refund_detailed");
        return modelAndView;
    }

    @RequestMapping("/shopping_detailed.do")
    public ModelAndView toShoppingDetailed(ModelAndView modelAndView){
        modelAndView.setViewName("shopping_detailed");
        return modelAndView;
    }

    @RequestMapping("/Ads_list.do")
    public ModelAndView toAdsList(ModelAndView modelAndView){
        modelAndView.setViewName("Ads_list");
        return modelAndView;
    }

    @RequestMapping("/member-show.do")
    public ModelAndView toMemberShow(ModelAndView modelAndView){
        modelAndView.setViewName("member-show");
        return modelAndView;
    }

}
