import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.uushopping.mapper.SuperManagerMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestDemo {
    @Autowired
    SuperManagerMapper superManagerMapper;
    @Test
    public void superManagerTest() {
        System.out.println(superManagerMapper.findSuperManagerInfoById(1));
    }
}
