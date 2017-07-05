package tk.zhangh.springboot.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by ZhangHao on 2017/7/5.
 */
public class MyApplicationStartedEventListener
        implements ApplicationListener<ApplicationStartingEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        System.out.println("==========" + this.getClass().getName() + "==========");
        SpringApplication app = event.getSpringApplication();
        app.setBanner((environment, sourceClass, out) -> {});// 不显示banner信息
    }
}
