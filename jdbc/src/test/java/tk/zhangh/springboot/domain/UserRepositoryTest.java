package tk.zhangh.springboot.domain;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import tk.zhangh.springboot.Tester;

import java.util.Date;

/**
 * Created by ZhangHao on 2017/6/17.
 */
public class UserRepositoryTest extends Tester {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void findByUserName() throws Exception {
        String name = saveUser();
        Assert.assertNotNull(userRepository.findByUserName(name));
    }

    @Test
    public void findByUserNameAndPassWord() throws Exception {
        String name = saveUser();
        Assert.assertNotNull(userRepository.findByUserNameAndPassWord(name, name));
    }

    @Test
    public void findUser() throws Exception {
        String name = saveUser();
        Assert.assertNotNull(userRepository.findUser(name));
    }

    @Test
    public void findALL() throws Exception {
        saveUser();
        saveUser();
        saveUser();
        saveUser();
        saveUser();
        saveUser();
        userRepository.findAll(new PageRequest(2, 3, new Sort(Sort.Direction.DESC, "id")));
    }

    private String saveUser() {
        String name = String.valueOf(new Date().getTime());
        userRepository.save(new User().setUserName(name).setPassWord(name));
        return name;
    }
}