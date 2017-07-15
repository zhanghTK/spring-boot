package tk.zhangh.springboot.refresh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import tk.zhangh.springboot.refresh.bean.ImportService;
import tk.zhangh.springboot.refresh.listener.MyApplicationListener;

@SpringBootApplication
@Import(ImportService.class)
@PropertySources(@PropertySource("classpath:simple.properties"))
@ImportResource("classpath:import.xml")
public class RefreshApplication {
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(RefreshApplication.class);
		application.addListeners(new MyApplicationListener());
		application.run(args);
	}
}
