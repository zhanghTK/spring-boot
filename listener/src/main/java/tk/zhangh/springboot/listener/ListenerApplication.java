package tk.zhangh.springboot.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListenerApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ListenerApplication.class);
        app.addListeners(
                new MyApplicationStartedEventListener(),
                new MyApplicationEnvironmentPreparedEventListener(),
                new MyApplicationPreparedEventListener(),
                new MyApplicationFailedEventListener());
        app.run(args);
    }
}
