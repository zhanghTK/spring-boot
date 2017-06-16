package tk.zhangh.springboot.redis;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import tk.zhangh.springboot.redis.domain.User;
import tk.zhangh.springboot.redis.service.UserService;

import java.util.concurrent.TimeUnit;

/**
 * Created by ZhangHao on 2017/6/16.
 */
public class RedisTest extends Tester{

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private UserService userService;

    @Test
    public void testStr() throws Exception {
        stringRedisTemplate.opsForValue().set("test.key", "test.value");
        Assert.assertEquals("test.value", stringRedisTemplate.opsForValue().get("test.key"));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testObj() throws Exception {
        User user = new User().setId("8").setUserName("8");
        ValueOperations<String, User> operations = redisTemplate.opsForValue();

        operations.set("user.id:8", user);
        operations.set("user.tmp.id:8", user, 1, TimeUnit.SECONDS);

        TimeUnit.SECONDS.sleep(1);

        Assert.assertTrue(redisTemplate.hasKey("user.id:8"));
        Assert.assertFalse(redisTemplate.hasKey("user.tmp.id:8"));

        redisTemplate.delete("user.id:8");
        Assert.assertFalse(redisTemplate.hasKey("user.id:8"));
    }
}