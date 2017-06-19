package tk.zhangh.springboot.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by ZhangHao on 2017/6/19.
 */
@SpringBootApplication
@MapperScan(basePackages = "tk.zhangh.springboot.mybatis.mapper")
public class Application  {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
