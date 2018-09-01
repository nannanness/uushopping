import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.uushopping.mapper.CarouselMapMapper;


import org.uushopping.mapper.GuestbookBusinessMapper;
import org.uushopping.mapper.StoreMapper;

import org.uushopping.mapper.SuperManagerMapper;

import org.uushopping.pojo.CarouselMap;
import org.uushopping.pojo.Store;
import org.uushopping.pojo.GuestbookBusiness;
import org.uushopping.pojo.User;
import org.uushopping.service.ISuperManagerService;
import org.uushopping.service.ISuperUserService;
import org.uushopping.service.IUserService;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestDemo {
    @Autowired
    SuperManagerMapper superManagerMapper;
    @Autowired
    CarouselMapMapper carouselMapMapper;

    @Autowired
    StoreMapper storeMapper;

    @Autowired
    GuestbookBusinessMapper guestbookBusinessMapper;

    @Autowired
    ISuperManagerService service;
    @Autowired
    IUserService iUserService;

    @Autowired
    ISuperUserService iSuperUserService;
    @Test
    public void superManagerTest() {
        System.out.println(superManagerMapper.findSuperManagerInfoById(1));
//        System.out.println(superManagerMapper.findSuperManagerInfoByNameAndPassword("大毛" , "qqq"));
//        System.out.println(superManagerMapper.findManagerHistoryById(1));
        System.out.println(service.findManagerHistoryByID(1));
//        service.insertManagerHistory(1,"1234");
//       List<User> list = iUserService.getUsers();
//        System.out.println(list);
//        User user = iSuperUserService.selectUser("张三","2018-09-12");
//        System.out.println(user);

    }

    @Test
    public void carouselMapTest(){
        List<CarouselMap> carouselMaps=carouselMapMapper.findAllCarousel();
        for (CarouselMap i:carouselMaps){
            System.out.println(i);
        }


    }
    @Test
    public void guestbookBusinessTest(){
        List<GuestbookBusiness> guestbookBusinesses=guestbookBusinessMapper.getAllGuestbookBusiness();
        for (GuestbookBusiness i:guestbookBusinesses){
            System.out.println(i);
        }


    }

    @Test
    public void storeTest(){
//        System.out.println(storeMapper);
//        List<Store> list = storeMapper.getAllStore();
//        System.out.println(list + "-------------------");
//        System.out.println(storeMapper.search("米")+"--------------");
//        System.out.println(storeMapper.getFlag(1));

        storeMapper.setFlag("已下架", 4);
    }

    @Test
    public void carouselMapTwoTest(){
//        carouselMapMapper.takeFlag("隐藏中",0,1);

//        String flag = carouselMapMapper.getFlag(2);
//        System.out.println(flag);
//
//        int count = carouselMapMapper.getCountFlag("显示中");
//        System.out.println(count);
//
//        System.out.println(carouselMapMapper.getOrder(1));

//        String dateStr = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
//        carouselMapMapper.uploadCarouselAddress("/resources/img/ad/ll.jpg",dateStr);

        carouselMapMapper.deleteCarouselMap(2);
    }

}
