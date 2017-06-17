package tk.zhangh.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tk.zhangh.springboot.domain.UserDao;

/**
 * Created by ZhangHao on 2017/6/17.
 */
@Component
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public void create(String name, String pwd) {
        userDao.create(name, pwd);
    }

    @Override
    public void deleteByName(String name) {
        userDao.deleteByName(name);
    }

    @Override
    public int getAllUser() {
        return userDao.getAllUser();
    }
}
