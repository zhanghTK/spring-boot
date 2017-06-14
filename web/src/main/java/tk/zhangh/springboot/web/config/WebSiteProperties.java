package tk.zhangh.springboot.web.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by ZhangHao on 2017/6/12.
 */
@Component
@Data
public class WebSiteProperties {
    @Value("${tk.zhangh.title}")
    private String title;

    @Value("${tk.zhangh.description}")
    private String description;
}
