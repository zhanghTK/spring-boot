package tk.zhangh.springboot.redis;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import tk.zhangh.springboot.redis.domain.User;
import tk.zhangh.springboot.redis.service.UserService;

/**
 * Created by ZhangHao on 2017/6/16.
 */
public class UserServiceTest extends Tester {

    @Autowired
    private UserService userService;

    @Test
    public void getUser() throws Exception {
        userService.getUser("1");
        userService.getUser("1");
        userService.getUser("1");
    }

    @Test
    public void save() throws Exception {
        userService.save(new User().setId("1"));
        userService.save(new User().setId("2"));
        userService.save(new User().setId("3"));
    }

    @Test
    public void delete() throws Exception {
        userService.delete(new User().setId("3"));
    }

    @Test
    public void deleteAll() throws Exception {
        userService.deleteAll();
    }

}