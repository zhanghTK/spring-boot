package tk.zhangh.springboot.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import tk.zhangh.springboot.Tester;

import java.util.Date;

/**
 * Created by ZhangHao on 2017/6/17.
 */
public class UserServiceTest extends Tester {

    @Autowired
    private UserService userService;

    @Test
    public void create() throws Exception {
        int count = userService.getAllUser();
        userService.create(new Date().toString(), new Date().toString());
        Assert.assertTrue(userService.getAllUser() > count);
    }

    @Test
    public void deleteByName() throws Exception {
        String name = new Date().toString();
        userService.create(name, name);
        userService.deleteByName(name);
    }

    @Test
    public void getAllUser() throws Exception {
        System.out.println(userService.getAllUser());
    }

}