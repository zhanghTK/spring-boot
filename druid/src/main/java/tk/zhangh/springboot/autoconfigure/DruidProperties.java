package tk.zhangh.springboot.autoconfigure;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 自定义Druid基本配置信息
 * Created by ZhangHao on 2017/6/22.
 */
@Data
@ConfigurationProperties(prefix = "druid")
public class DruidProperties {
    private String url;
    private String username;
    private String password;
    private String driverClass;
    private String filters;
    private String connectionProperties;
    private String validationQuery;

    private Boolean testWhileIdle;
    private Boolean testOnBorrow;
    private Boolean testOnReturn;
    private Boolean poolPreparedStatements;

    private Integer maxWait;
    private Integer maxActive;
    private Integer minIdle;
    private Integer initialSize;
    private Integer timeBetweenEvictionRunsMillis;
    private Integer minEvictableIdleTimeMillis;
    private Integer maxPoolPreparedStatementPerConnectionSize;
}
