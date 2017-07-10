package tk.zhangh.springboot.startup;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import tk.zhangh.springboot.startup.bean.SimpleBean;
import tk.zhangh.springboot.startup.runner.SimpleApplicationRunner;
import tk.zhangh.springboot.startup.runner.SimpleCommandLineRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StartupApplicationTests {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void contextLoads() {
        Assert.assertNotNull(applicationContext.getBean(SimpleApplicationRunner.class));
        Assert.assertNotNull(applicationContext.getBean(SimpleCommandLineRunner.class));
        Assert.assertNotNull(applicationContext.getBean(SimpleBean.class));
    }

}
