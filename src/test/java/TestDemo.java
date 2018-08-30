import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.uushopping.mapper.StoreMapper;
import org.uushopping.mapper.SuperManagerMapper;
import org.uushopping.pojo.Store;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestDemo {
    @Autowired
    SuperManagerMapper superManagerMapper;
    @Autowired
    StoreMapper storeMapper;
    @Test
    public void superManagerTest() {
        System.out.println(superManagerMapper.findSuperManagerInfoById(1));
        System.out.println(superManagerMapper.findSuperManagerInfoByNameAndPassword("大毛" , "qqq"));
    }
    @Test
    public void storeTest(){
//        System.out.println(storeMapper);
//        List<Store> list = storeMapper.getAllStore();
//        System.out.println(list + "-------------------");
//        System.out.println(storeMapper.search("米")+"--------------");
//        System.out.println(storeMapper.getFlag(1));

        storeMapper.setFlag("已下架", 2);
    }

}
