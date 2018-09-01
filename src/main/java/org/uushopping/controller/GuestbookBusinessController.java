package org.uushopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.uushopping.pojo.GuestbookBusiness;
import org.uushopping.service.IGuestbookBusinessService;


import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Array;
import java.util.List;

@Controller
@RequestMapping("/guestbookBusinessController")
public class GuestbookBusinessController {
    @Autowired
IGuestbookBusinessService iGuestbookBusinessService;
    @RequestMapping("/Guestbook-business.do")
    public ModelAndView getAllGuestbookBusiness(ModelAndView modelAndView){
        List<GuestbookBusiness> guestbookBusinessList = iGuestbookBusinessService.getAllGuestbookBusiness();
        modelAndView.setViewName("Guestbook-business");
        modelAndView.addObject("guestbookBusinessList" , guestbookBusinessList);
        return modelAndView;
    }
@RequestMapping("/search.do")
public ModelAndView search(ModelAndView modelAndView , @RequestParam("text") String arg0 , @RequestParam("laydate") String arg1){
    List<GuestbookBusiness> guestbookBusinessList = iGuestbookBusinessService.search(arg0);
    System.out.println(arg1);
    modelAndView.setViewName("Guestbook-business");
    modelAndView.addObject("guestbookBusinessList" , guestbookBusinessList);
    return modelAndView;
}
@RequestMapping("/delete.do")
    public ModelAndView detele(ModelAndView modelAndView,@RequestParam("commentId") int commentId){
        iGuestbookBusinessService.deleteCommentId(commentId);
        modelAndView.setViewName("Guestbook-business");
        return modelAndView;
}
    @RequestMapping("/deleteSome.do")
    public void deteleSome(HttpServletResponse response, @RequestParam("ids") String ids){
        System.out.println(ids);
        String[] aa=ids.split(",");

        for ( int i = 0; i <aa.length; i++){
            System.out.println(aa[i]);
            System.out.println(Integer.valueOf(aa[i]));
            iGuestbookBusinessService.deleteCommentId(Integer.valueOf(aa[i]));
        }

    }
}
