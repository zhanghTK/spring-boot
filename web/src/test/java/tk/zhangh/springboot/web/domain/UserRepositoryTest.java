package tk.zhangh.springboot.web.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import tk.zhangh.springboot.web.Application;

import java.text.DateFormat;
import java.util.Date;

import static java.text.DateFormat.LONG;

/**
 * Created by ZhangHao on 2017/6/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@Transactional
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Before
    public void insert() {
        User user = User.builder()
                .email("random@163.com").nickName("nickName").passWord("pwd")
                .userName("username").regTime(DateFormat.getDateTimeInstance(LONG, LONG).format(new Date()))
                .build();
        userRepository.save(user);
    }

    @Test
    public void findByUserName() throws Exception {
        Assert.assertNotNull(userRepository.findByUserName("username"));
    }

    @Test
    public void findByUserNameOrEmail() throws Exception {
        Assert.assertEquals("username", userRepository.findByUserNameOrEmail("", "random@163.com").getUserName());
    }

    @Test
    public void findById() throws Exception {
        Assert.assertNotNull(userRepository.findById(1L));
    }
}