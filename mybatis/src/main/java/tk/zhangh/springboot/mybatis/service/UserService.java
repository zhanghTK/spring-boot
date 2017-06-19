package tk.zhangh.springboot.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tk.zhangh.springboot.mybatis.common.CommonService;
import tk.zhangh.springboot.mybatis.entity.User;
import tk.zhangh.springboot.mybatis.mapper.UserMapper;

import java.util.List;

/**
 * Created by ZhangHao on 2017/6/19.
 */
@Component
public class UserService extends CommonService {

    @Autowired
    private UserMapper mapper;

    public List<User> getAll(User user) {
        pageableBeforeSelect(user);
        return mapper.selectAll();
    }

    public User getById(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    public void deleteById(Long id) {
        mapper.deleteByPrimaryKey(id);
    }

    public void save(User user) {
        if (user.getId() != null) {
            mapper.updateByPrimaryKey(user);
        } else {
            mapper.insertSelective(user);
        }
    }
}
