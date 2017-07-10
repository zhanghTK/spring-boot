package tk.zhangh.springboot.startup;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import tk.zhangh.springboot.startup.bean.SimpleBean;

@SpringBootApplication
@Slf4j
public class StartupApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(StartupApplication.class, args);
		SimpleBean bean = applicationContext.getBean("testBean", SimpleBean.class);
		log.info("id:{}, name:{}", bean.getId(), bean.getName());
	}
}
