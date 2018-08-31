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


import org.uushopping.pojo.GuestbookBusiness;
import org.uushopping.service.IGuestbookBusinessService;
import org.uushopping.service.ISuperManagerService;


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
    IGuestbookBusinessService iGuestbookBusinessService;
    @Autowired
    ISuperManagerService service;

    @Test
    public void superManagerTest() {
//        System.out.println(superManagerMapper.findSuperManagerInfoById(1));
//        System.out.println(superManagerMapper.findSuperManagerInfoByNameAndPassword("大毛" , "qqq"));
        System.out.println(superManagerMapper.findManagerHistoryById(1));
        System.out.println(service.findManagerHistoryByID(1));
        service.insertManagerHistory(1,"1234");
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
        guestbookBusinessMapper.deleteByCommentId(11);



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

        String dateStr = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
        carouselMapMapper.uploadCarouselAddress("/resources/img/ad/ll.jpg",dateStr);
    }

}
