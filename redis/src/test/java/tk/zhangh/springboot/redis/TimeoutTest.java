package tk.zhangh.springboot.redis;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.concurrent.TimeUnit;

/**
 * Created by ZhangHao on 2017/7/6.
 */
@Slf4j
public class TimeoutTest extends Tester {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void test() throws InterruptedException {
        stringRedisTemplate.opsForValue().set("test", "100", 1, TimeUnit.MILLISECONDS);
        TimeUnit.SECONDS.sleep(2);
    }
}
