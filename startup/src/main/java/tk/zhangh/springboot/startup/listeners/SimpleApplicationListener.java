package tk.zhangh.springboot.startup.listeners;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * 监听器
 * Created by ZhangHao on 2017/7/7.
 */
@Slf4j
public class SimpleApplicationListener implements ApplicationListener<ApplicationEvent> {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof ApplicationStartingEvent) {
            log.info("===== custom starting event in initializer =====");
        }else if (event instanceof ApplicationReadyEvent) {
            log.info("===== custom ready event in initializer =====");
        }
    }
}
