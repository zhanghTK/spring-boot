package tk.zhangh.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.zhangh.springboot.web.config.WebSiteProperties;

import javax.servlet.http.HttpSession;
import java.util.UUID;

@RestController
public class HelloController {

    @Autowired
    private WebSiteProperties webSiteProperties;

    @GetMapping("/hello")
    public String hello() {
        return webSiteProperties.getTitle();
    }

    @GetMapping("/uid")
    public String uid(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        uid = uid == null ? UUID.randomUUID() : uid;
        session.setAttribute("uid", uid);
        return session.getId();
    }
}