package tk.zhangh.springboot.startup.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 自定义CommandLineRunner
 * Created by ZhangHao on 2017/7/7.
 */
@Component
@Slf4j
public class SimpleCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
      log.info("===== SimpleCommandLineRunner =====");
    }
}
