package tk.zhangh.springboot.mybatis.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import tk.zhangh.springboot.mybatis.entity.User;

import java.util.Date;

/**
 * Created by ZhangHao on 2017/6/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Transactional
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void getAll() throws Exception {
        userService.getAll(new User());
    }

    @Test
    public void getById() throws Exception {
        Assert.assertNotNull(userService.getById(3L));
    }

    @Test
    public void deleteById() throws Exception {
        userService.deleteById(3L);
        Assert.assertNull(userService.getById(3L));
    }

    @Test
    public void save() throws Exception {
        String string = String.valueOf(new Date().getTime());
        User user = userService.getById(3L).setUserName(string);
        userService.save(user);
        userService.deleteById(user.getId());
        userService.save(new User().setUserName(string).setPassWord(string));
    }

}