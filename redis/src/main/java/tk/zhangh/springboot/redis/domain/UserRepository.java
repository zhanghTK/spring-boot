package tk.zhangh.springboot.redis.domain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserRepository {

    public User findById(String id) {
        log.info("find-user-by-id:{}", id);
        return new User().setId(id);
    }

    public User findByName(String name) {
        log.info("find-user-by-name:{}", name);
        return new User().setUserName(name);
    }

    public User findByNameAndPwd(String name, String pwd) {
        log.info("find-user-by-name-and-pwd:{},{}", name, pwd);
        return new User().setUserName(name).setPassWord(pwd);
    }

    public User save(User user) {
        log.info("save:{}", user);
        return user;
    }

    public User delete(User user) {
        log.info("delete:{}", user);
        return user;
    }

    public void deleteAll() {
        log.info("delete-all-users");
    }
}