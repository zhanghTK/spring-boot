package tk.zhangh.springboot.startup.initializers;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import tk.zhangh.springboot.startup.bean.SimpleBean;

/**
 * 自定义初始化器
 * Created by ZhangHao on 2017/7/7.
 */
public class SimpleApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        applicationContext.getBeanFactory()
                .registerSingleton("testBean", new SimpleBean("id-001", "created by initializer"));
    }
}
