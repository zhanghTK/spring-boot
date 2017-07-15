package tk.zhangh.springboot.refresh.bean;

import org.springframework.stereotype.Component;

/**
 * Created by ZhangHao on 2017/7/10.
 */
@Component
public class SimpleService {

    private String name = "simple";

    public SimpleService() {
        System.out.println("------ SimpleService constructor invoke");
    }

    public void test() {
        System.out.println(name);
    }
}
