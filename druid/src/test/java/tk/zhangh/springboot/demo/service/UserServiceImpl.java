package tk.zhangh.springboot.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tk.zhangh.springboot.demo.dao.UserDao;
import tk.zhangh.springboot.demo.model.User;

/**
 * Created by ZhangHao on 2017/6/22.
 */
@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User findById(Long id) {
        return userDao.findOne(id);
    }
}
