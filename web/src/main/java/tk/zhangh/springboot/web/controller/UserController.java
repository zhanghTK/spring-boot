package tk.zhangh.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tk.zhangh.springboot.web.domain.User;
import tk.zhangh.springboot.web.domain.UserRepository;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/getUser")
    public User getUser(@RequestParam(value = "uid") String uid) {
        return userRepository.findById(Long.valueOf(uid));
    }

    @GetMapping("/getUsers")
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}