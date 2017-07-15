package tk.zhangh.springboot.refresh.bean;

import org.springframework.context.annotation.Bean;

/**
 * invokeBeanFactoryPostProcessors方法处理BeanFactoryPostProcessor
 * Created by ZhangHao on 2017/7/10.
 */
public class ImportService {
    @Bean
    public SimpleServiceInImportService simpleServiceInImportService() {
        return new SimpleServiceInImportService();
    }

    public class SimpleServiceInImportService {
        private String name = "simpleServiceInImportService";

        public SimpleServiceInImportService() {
            System.out.println(name);
        }
    }
}
