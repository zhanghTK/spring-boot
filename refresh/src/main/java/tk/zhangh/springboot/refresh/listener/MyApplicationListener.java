package tk.zhangh.springboot.refresh.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * Created by ZhangHao on 2017/7/10.
 */
public class MyApplicationListener implements ApplicationListener<ApplicationEvent> {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof ContextRefreshedEvent) {
            ApplicationContext applicationContext = ((ContextRefreshedEvent) event).getApplicationContext();
            if (applicationContext instanceof AbstractApplicationContext) {
                ((GenericApplicationContext) applicationContext).getBeanFactory().registerSingleton("simpleBeanInListener", new SimpleBeanInListener());
            }

        }
    }

    public class SimpleBeanInListener {}
}
