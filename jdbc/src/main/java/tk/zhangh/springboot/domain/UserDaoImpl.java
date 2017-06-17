package tk.zhangh.springboot.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by ZhangHao on 2017/6/17.
 */
@Component
public class UserDaoImpl implements UserDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(String name, String pwd) {
        jdbcTemplate.update("INSERT user (user_name, pass_word) VALUES (?, ?)", name, pwd);
    }

    @Override
    public void deleteByName(String name) {
        jdbcTemplate.update("DELETE FROM user WHERE user_name = ?", name);
    }

    @Override
    public int getAllUser() {
        return jdbcTemplate.queryForObject("SELECT count(*) FROM user", Integer.class);
    }
}
