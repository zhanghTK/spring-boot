package tk.zhangh.springboot.listener;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.PropertySource;

/**
 * Created by ZhangHao on 2017/7/5.
 */
public class MyApplicationEnvironmentPreparedEventListener
        implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {
    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
        System.out.println("==========" + this.getClass().getName() + "==========");
        for (PropertySource<?> ps : event.getEnvironment().getPropertySources()) {
            System.out.println("ps.getName:" + ps.getName() + ";ps.getSource:" + ps.getSource() + ";ps.getClass:" + ps.getClass());
        }
    }
}
