package tk.zhangh.springboot.startup.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * 自定义ApplicationRunner
 * Created by ZhangHao on 2017/7/7.
 */
@Component
@Slf4j
public class SimpleApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("===== SimpleApplicationRunner =====");
    }
}
