package tk.zhangh.springboot.redis;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import tk.zhangh.springboot.redis.service.Receiver;

/**
 * Created by ZhangHao on 2017/7/6.
 */
public class SubMsgTest extends Tester {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void test() throws InterruptedException {
        stringRedisTemplate.convertAndSend("chat", "Hello from Redis!");
        Receiver.latch.await();
    }
}
