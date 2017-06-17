package tk.zhangh.springboot.service;

/**
 * Created by ZhangHao on 2017/6/17.
 */
public interface UserService {
    void create(String name, String pwd);

    void deleteByName(String name);

    int getAllUser();
}
