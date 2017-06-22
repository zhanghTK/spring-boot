package tk.zhangh.springboot.demo.dao;


import org.springframework.data.repository.CrudRepository;
import tk.zhangh.springboot.demo.model.User;

/**
 * Created by ZhangHao on 2017/6/22.
 */
public interface UserDao extends CrudRepository<User, Long> {
}

