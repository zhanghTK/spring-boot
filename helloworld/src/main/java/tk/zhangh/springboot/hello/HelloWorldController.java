package tk.zhangh.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ZhangHao on 2017/6/10.
 */
@RestController
public class HelloWorldController {
    @RequestMapping("hello")
    public String index() {
        return "Hello Spring Boot";
    }
}
