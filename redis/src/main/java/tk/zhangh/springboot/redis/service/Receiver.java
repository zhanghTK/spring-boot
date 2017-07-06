package tk.zhangh.springboot.redis.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

/**
 * Created by ZhangHao on 2017/7/6.
 */
@Slf4j
@Component
public class Receiver {
    public static final CountDownLatch latch = new CountDownLatch(1);

    public void receiveMessage(String message) {
        log.info("Received <" + message + ">");
        latch.countDown();
    }
}
