package org.uushopping.controller;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.uushopping.pojo.CarouselMap;
import org.uushopping.service.ICarousel_mapManagerService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Controller
@RequestMapping("/carouselMapController")
public class CarouselMapController {
    @Autowired
    ICarousel_mapManagerService carouselMapManagerService;
    @RequestMapping("/advertising.do")
    public ModelAndView findAllCarousel(ModelAndView modelAndView){
        List<CarouselMap> carouselMapList=carouselMapManagerService.findAllCarousel();
        modelAndView.setViewName("advertising");
        modelAndView.addObject("carouselMaplist" , carouselMapList);
        return modelAndView;
    }

    @RequestMapping("/show.do")
    public void takeShow(HttpServletResponse response , @RequestParam("carouselMapOrder") int carouselMapOrder ,@RequestParam("carouselMapId") int carouselMapId) throws IOException {
        PrintWriter out = response.getWriter();
        String flag = carouselMapManagerService.getFlag(carouselMapId);
        if("隐藏中".equals(flag)){
            carouselMapManagerService.takeFlag("显示中", carouselMapOrder, carouselMapId);
            int order = carouselMapManagerService.getOrder(carouselMapId);
            JSONObject json = JSONObject.parseObject("{\"flag\":\"show\",\"order\":\""+order+"\"}");
            String strJson = json.toJSONString();
            out.write(strJson);
        }
    }

    @RequestMapping("/hidden.do")
    public void takeHidden(HttpServletResponse response , @RequestParam("carouselMapId") int carouselMapId) throws IOException {
        PrintWriter out = response.getWriter();
        String flag = carouselMapManagerService.getFlag(carouselMapId);
        if("显示中".equals(flag)){
            carouselMapManagerService.takeFlag("隐藏中",0,carouselMapId);
            JSONObject json = JSONObject.parseObject("{\"flag\":\"hidden\"}");
            String strJson = json.toJSONString();
            out.write(strJson);
        }
    }

    @RequestMapping("/upload_ad.do")
    public void uploadAd(HttpServletResponse response , HttpServletRequest request,ModelAndView modelAndView) throws IOException {
        PrintWriter out = response.getWriter();
        String path = "";
        String pathDie = "resources/img/ad/";
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);//判断是否是表单文件类型
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload sfu = new ServletFileUpload(factory);
        List items = null;
        try {
            items = sfu.parseRequest(request);//从request得到所有上传域的列表
        } catch (Exception e) {
        }
        for (Iterator iter = items.iterator(); iter.hasNext(); ) {
            FileItem fileitem = (FileItem) iter.next();
            if (!fileitem.isFormField() && fileitem != null) {//判读不是普通表单域即是file
                System.out.println(fileitem);
                path = pathDie + fileitem.getName();
                pathDie = pathDie + fileitem.getName();
                String realPath = request.getServletContext().getRealPath("/");
                System.out.println(realPath);
                String[] s = realPath.split("target");
                File fileUploadHere = new File(s[0] + "src/main/webapp/" + path);
                File fileWarPath = new File(realPath + pathDie);
                FileUtils.copyInputStreamToFile(fileitem.getInputStream(),fileWarPath);
                FileUtils.copyInputStreamToFile(fileitem.getInputStream(),fileUploadHere);
                System.out.println(fileWarPath);
            }
        }
        String dateStr = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
        carouselMapManagerService.uploadCarouselAddress("/"+ pathDie,dateStr);
        out.write("{\"name\":\"flash\"}");
    }

    @RequestMapping("/delete.do")
    public void delete(HttpServletResponse response , @RequestParam("jsonCheckId") String jsonCheckId) throws IOException {
        PrintWriter out = response.getWriter();
        String[] stringIds = jsonCheckId.split(",");
        int[] ints = new int[stringIds.length];
        for(int i=0;i<stringIds.length;i++){
            ints[i] = Integer.parseInt(stringIds[i]);
        }
        for(int i : ints){
            carouselMapManagerService.deleteCarouselMap(i);
        }
        out.write("{\"name\":\"flash\"}");
    }
}
