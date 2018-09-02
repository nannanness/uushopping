import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.uushopping.mapper.*;


import org.uushopping.pojo.*;
import org.uushopping.service.ICommodityService;
import org.uushopping.service.ISuperManagerService;
import org.uushopping.service.ISuperUserService;
import org.uushopping.service.IUserOrderInStoreService;
import org.uushopping.service.IUserService;
import org.uushopping.service.impl.CommodityServiceImpl;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestDemo {
    @Autowired
    SuperManagerMapper superManagerMapper;
    @Autowired
    CommodityServiceImpl commodityService1;

    @Autowired
    StoreMapper storeMapper;
    @Autowired
    CommodityMapper commodityMapper;
    @Autowired
    GuestbookBusinessMapper guestbookBusinessMapper;

    @Autowired
    ISuperManagerService service;
    @Autowired
    IUserService iUserService;
    @Autowired
    ShopLoginMapper shopLoginMapper;
    @Autowired
    ISuperUserService iSuperUserService;

    @Autowired
    UserOrderInStoreMapper userOrderInStoreMapper;
    @Autowired
    IUserOrderInStoreService iUserOrderInStoreService;


    @Autowired
    ICommodityService commodityService;

    @Test
    public void superManagerTest() {
        List<HotCommodity> hotCommodities = commodityMapper.selectShoe();
        System.out.println(hotCommodities);
    }
    @Test
    public  void ShopOrderAll(){
        shopLoginMapper.updateOrderStatus("已发货","天天",160105012);
        shopLoginMapper.deleteByOrderId(160105012);
       List<Orders> orders = shopLoginMapper.ShopOrdersAll();
        for (Orders i:orders){
            System.out.println(i);
        }

    }
    @Test
    public void commodityMapper(){

//        System.out.println(commodityMapper.selectCommodityById(1));
//        System.out.println(commodityMapper.getCommodityByClass("手机"));

//        System.out.println(commodityMapper.getStoreByClass("手机"));
//        System.out.println(commodityMapper.getCommodityImageByCommodityId(1));
//        System.out.println(commodityService.getCommodityImageByCommodityId(1));

        System.out.println(commodityMapper.getCommodity_Image("手机").size());
        System.out.println(commodityMapper.getALLCommodity_Image().size());
    }


    @Test
    public void carouselMapTest(){

        System.out.println(storeMapper.selectStoreById(1));


    }
    @Test
    public void findAllOrderInStore(){
        List<UserOrderInStore> userOrderInStores=iUserOrderInStoreService.findAllOrderInStore(27);
        for (UserOrderInStore i:userOrderInStores){
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


    }

}
