package tk.zhangh.springboot.demo.service;


import tk.zhangh.springboot.demo.model.User;

/**
 * Created by ZhangHao on 2017/6/22.
 */
public interface UserService {
    User findById(Long id);
}
