package org.uushopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.uushopping.pojo.Commodity;
import org.uushopping.pojo.CommodityInfo;
import org.uushopping.pojo.Store;
import org.uushopping.service.impl.CommodityServiceImpl;
import org.uushopping.service.impl.Ifunclmpl;
import org.uushopping.service.impl.StoreServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/pageJump")
public class PageJump {
    @Autowired
    CommodityServiceImpl commodityService ;
    @Autowired
    StoreServiceImpl storeService;
    @Autowired
    Ifunclmpl ifunclmpl;
    //商品页面
    @RequestMapping("/page.do")
    public ModelAndView toPage(@RequestParam int storeId,@RequestParam int commodityId, ModelAndView modelAndView){
        System.out.println(storeId+"----"+commodityId);
        //获取商品的详细信息
        CommodityInfo commodity = commodityService.selectCommodityById(commodityId);
        //获取店铺的信息
        Store store = storeService.findStoreById(storeId);
        modelAndView.addObject("commodity",commodity);
        modelAndView.addObject("store",store);
        modelAndView.setViewName("page");
        return modelAndView;
    }

    @RequestMapping("/index-system.do")
    public ModelAndView toManager(ModelAndView modelAndView){
        modelAndView.setViewName("index-system");
        System.out.println("----------index-system----------");
        return modelAndView;
    }
    @RequestMapping("/index-business.do")
    public ModelAndView toShop(ModelAndView modelAndView){
        modelAndView.setViewName("index-business");
        System.out.println("----------index-business----------");
        return modelAndView;
    }
    @RequestMapping("/home.do")
    public ModelAndView toHome(ModelAndView modelAndView){
        modelAndView.setViewName("home");
        System.out.println("----------home----------");
        return modelAndView;
    }
    @RequestMapping("/home-business.do")
    public ModelAndView toHomeBusiness(ModelAndView modelAndView){
        modelAndView.setViewName("home-business");
        System.out.println("----------home-business----------");
        return modelAndView;
    }

    @RequestMapping("/Systems.do")
    public ModelAndView toSystems(ModelAndView modelAndView){
        modelAndView.setViewName("Systems");
        System.out.println("----------Systems----------");
        return modelAndView;
    }

    @RequestMapping("/Products_List-business.do")
    public ModelAndView toProductsListBusiness(ModelAndView modelAndView){
        modelAndView.setViewName("Products_List-business");
        return modelAndView;
    }

    @RequestMapping("/Category_Manage.do")
    public ModelAndView toCategoryManage(ModelAndView modelAndView){
        modelAndView.setViewName("Category_Manage");
        return modelAndView;
    }
    @RequestMapping("/Category_Manage-business.do")
    public ModelAndView toCategoryManageBusiness(ModelAndView modelAndView){
        modelAndView.setViewName("Category_Manage-business");
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
    @RequestMapping("/transaction-business.do")
    public ModelAndView toTransactionBusiness(ModelAndView modelAndView){
        modelAndView.setViewName("transaction-business");
        return modelAndView;
    }

    @RequestMapping("/Order_Chart.do")
    public ModelAndView toOrderChart(ModelAndView modelAndView){
        modelAndView.setViewName("Order_Chart");
        return modelAndView;
    }
    @RequestMapping("/Order_Chart-business.do")
    public ModelAndView toOrderChartBusiness(ModelAndView modelAndView){
        modelAndView.setViewName("Order_Chart-business");
        return modelAndView;
    }

    @RequestMapping("/Amounts.do")
    public ModelAndView toAmounts(ModelAndView modelAndView){
        modelAndView.setViewName("Amounts");
        return modelAndView;
    }
    @RequestMapping("/Amounts-business.do")
    public ModelAndView toAmountsBusiness(ModelAndView modelAndView){
        modelAndView.setViewName("Amounts-business");
        return modelAndView;
    }

    @RequestMapping("/Order_handling.do")
    public ModelAndView toOrderHandling(ModelAndView modelAndView){
        modelAndView.setViewName("Order_handling");
        return modelAndView;
    }
    @RequestMapping("/Order_handling-business.do")
    public ModelAndView toOrderHandlingBusiness(ModelAndView modelAndView){
        modelAndView.setViewName("Order_handling-business");
        return modelAndView;
    }

    @RequestMapping("/Refund.do")
    public ModelAndView toRefund(ModelAndView modelAndView){
        modelAndView.setViewName("Refund");
        return modelAndView;
    }
    @RequestMapping("/Refund-business.do")
    public ModelAndView toRefundBusiness(ModelAndView modelAndView){
        modelAndView.setViewName("Refund-business");
        return modelAndView;
    }
    @RequestMapping("/login.do")
    public ModelAndView toLogin(ModelAndView modelAndView){
        modelAndView.setViewName("login");
        return modelAndView;
    }
    @RequestMapping("/login-business.do")
    public ModelAndView toLoginBusiness(ModelAndView modelAndView){
        modelAndView.setViewName("/login-business.jsp");
        return modelAndView;
    }


    @RequestMapping("/Refund_detailed-business.do")
    public ModelAndView toRefundBusinessDetailed(ModelAndView modelAndView){
        modelAndView.setViewName("Refund_detailed-business");
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
    @RequestMapping("/integration-business.do")
    public ModelAndView toIntegrationBusiness(ModelAndView modelAndView){
        modelAndView.setViewName("integration-business");
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

    @RequestMapping("/picture-add.do")
    public ModelAndView toPictureAdd(ModelAndView modelAndView){
        modelAndView.setViewName("picture-add");
        return modelAndView;
    }
    @RequestMapping("/picture-add-business.do")
    public ModelAndView toPictureAddBusiness(ModelAndView modelAndView){
        modelAndView.setViewName("picture-add-business");
        return modelAndView;
    }

    @RequestMapping("/login-system.do")
    public ModelAndView toLoginSystem(ModelAndView modelAndView){
        modelAndView.setViewName("login-system");
        return modelAndView;
    }

    @RequestMapping("/Refund_detailed.do")
    public ModelAndView toRefundDetailed(ModelAndView modelAndView){
        modelAndView.setViewName("Refund_detailed");
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
    @RequestMapping("/product-category-add-business.do")
    public ModelAndView toProductCategoryAddBusiness(ModelAndView modelAndView){
        modelAndView.setViewName("product-category-add-business");
        return modelAndView;
    }
//    @RequestMapping("/Guestbook-business.do")
//    public ModelAndView toGuestbookBusiness(ModelAndView modelAndView){
//        modelAndView.setViewName("Guestbook-business");
//        return modelAndView;
//    }


    @RequestMapping("/order_detailed.do")
    public ModelAndView toOrderDetailed(ModelAndView modelAndView){
        modelAndView.setViewName("order_detailed");
        return modelAndView;
    }
    @RequestMapping("/order_detailed-business.do")
    public ModelAndView toOrderDetailedBusiness(ModelAndView modelAndView){
        modelAndView.setViewName("order_detailed-business");
        return modelAndView;
    }

    @RequestMapping("/Payment_details.do")
    public ModelAndView toPaymentDetails(ModelAndView modelAndView){
        modelAndView.setViewName("Payment_details");
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
    @RequestMapping("/joinShopCar.do")
    public void joinShopCar(HttpServletRequest request,@RequestParam int commodityId,@RequestParam int storeId, HttpServletResponse response,HttpSession session) throws ServletException, IOException {
        int ShopCarNum = (int)session.getAttribute("ShopCarNum");
        ifunclmpl.joinCommodity(ShopCarNum,commodityId);
        request.getRequestDispatcher("/pageJump/page.do?storeId="+storeId+"&commodityId="+commodityId).forward(request,response);

    }

}
