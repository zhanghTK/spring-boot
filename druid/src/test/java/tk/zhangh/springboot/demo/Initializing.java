package tk.zhangh.springboot.demo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tk.zhangh.springboot.demo.dao.UserDao;
import tk.zhangh.springboot.demo.model.User;

/**
 * Created by ZhangHao on 2017/6/22.
 */
@Component
public class Initializing implements InitializingBean {
    @Autowired
    private UserDao userDao;

    @Override
    public void afterPropertiesSet() throws Exception {
        for (int i = 1; i <= 100; i++) {
            userDao.save(new User("TEST-NAME-" + i));
        }
    }
}
