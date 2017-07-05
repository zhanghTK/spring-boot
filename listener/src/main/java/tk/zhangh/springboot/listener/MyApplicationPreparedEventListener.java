package tk.zhangh.springboot.listener;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by ZhangHao on 2017/7/5.
 */
public class MyApplicationPreparedEventListener
        implements ApplicationListener<ApplicationPreparedEvent> {
    @Override
    public void onApplicationEvent(ApplicationPreparedEvent event) {
        System.out.println("==========" + this.getClass().getName() + "==========");
    }
}
