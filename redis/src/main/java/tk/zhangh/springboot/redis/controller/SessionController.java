package tk.zhangh.springboot.redis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 * Created by ZhangHao on 2017/6/16.
 */
@RestController
public class SessionController {
    @GetMapping("/uid")
    public String uid(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        uid = uid == null ? UUID.randomUUID() : uid;
        session.setAttribute("uid", uid);
        return session.getId();
    }
}
