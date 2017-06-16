package tk.zhangh.springboot.redis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import tk.zhangh.springboot.redis.domain.User;
import tk.zhangh.springboot.redis.domain.UserRepository;

/**
 * Created by ZhangHao on 2017/6/16.
 */
@Component
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Cacheable(value = "user", key = "#id")
    public User getUser(String id) {
        return userRepository.findById(id);
    }

    @CachePut(value = "user", key = "#user.id")
    public User save(User user) {
        return userRepository.save(user);
    }

    @CacheEvict(value = "user", key = "#user.id")
    public User delete(User user) {
        return userRepository.delete(user);
    }

    @CacheEvict(value = "user", allEntries = true)
    public void deleteAll() {
        userRepository.deleteAll();
    }

    /**
     * 有条件的缓存，缓存name小于4的结果
     */
    @Cacheable(value = "user", condition = "#name.length() <= 4")
    public User getUserByName(String name) {
        return userRepository.findByName(name);
    }

    /**
     * 使用多个参数进行key组合
     */
    @Cacheable(value = "user", key = "#name.concat(#pwd)")
    public User getUser(String name, String pwd) {
        return userRepository.findByNameAndPwd(name, pwd);
    }
}
