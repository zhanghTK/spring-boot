package tk.zhangh.springboot.demo.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.zhangh.springboot.demo.model.User;
import tk.zhangh.springboot.demo.service.UserService;

/**
 * Created by ZhangHao on 2017/6/22.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user/{id}")
    public User list(@PathVariable Long id) {
        return userService.findById(id);
    }
}
