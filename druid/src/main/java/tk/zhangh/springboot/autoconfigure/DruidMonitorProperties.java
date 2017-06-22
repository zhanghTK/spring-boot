package tk.zhangh.springboot.autoconfigure;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 自定义Druid监控配置信息
 * Created by ZhangHao on 2017/6/22.
 */
@Data
@ConfigurationProperties(prefix = "druid.monitor")
public class DruidMonitorProperties {
    private String DruidStatView;
    private String DruidWebStatFilter;

    private String allow;
    private String deny;
    private String loginUsername;
    private String loginPassword;

    private String exclusions;
    private String resetEnable;

    private String[] aopPatterns;
}
