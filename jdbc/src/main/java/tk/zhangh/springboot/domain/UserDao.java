package tk.zhangh.springboot.domain;

/**
 * Created by ZhangHao on 2017/6/17.
 */
public interface UserDao {
    void create(String name, String pwd);

    void deleteByName(String name);

    int getAllUser();
}
