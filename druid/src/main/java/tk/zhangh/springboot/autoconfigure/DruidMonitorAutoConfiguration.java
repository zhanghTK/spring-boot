package tk.zhangh.springboot.autoconfigure;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Druid监控自动配置
 * Created by ZhangHao on 2017/6/22.
 */
@Configuration
@ConditionalOnClass(DruidDataSource.class)
@EnableConfigurationProperties(DruidMonitorProperties.class)
@ConditionalOnProperty(prefix = "druid.monitor", havingValue = "enabled", value = "enabled")
@AutoConfigureAfter(DataSource.class)
@Slf4j
public class DruidMonitorAutoConfiguration {

    @Autowired
    private DruidMonitorProperties properties;

    /**
     * 注册一个StatViewServlet
     */
    @Bean
    public ServletRegistrationBean druidStatViewServlet() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(), properties.getDruidStatView());

        servletRegistrationBean.addInitParameter("allow", properties.getAllow());
        log.info("allow ---> " + properties.getAllow());

        servletRegistrationBean.addInitParameter("deny", properties.getDeny());
        log.info("deny ---> " + properties.getDeny());

        servletRegistrationBean.addInitParameter("loginUsername", properties.getLoginUsername());
        servletRegistrationBean.addInitParameter("loginPassword", properties.getLoginPassword());
        log.info("loginUsername ---> " + properties.getLoginUsername() + "loginPassword ---> " + properties.getLoginPassword());

        servletRegistrationBean.addInitParameter("resetEnable", properties.getResetEnable());
        log.info("resetEnable ---> " + properties.getResetEnable());

        return servletRegistrationBean;
    }

    /**
     * 注册一个：filterRegistrationBean
     */
    @Bean
    public FilterRegistrationBean druidStatFilter() {

        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());

        filterRegistrationBean.addUrlPatterns(properties.getDruidWebStatFilter());
        log.info("urlPatterns ---> " + properties.getDruidWebStatFilter());

        filterRegistrationBean.addInitParameter("exclusions", properties.getExclusions());
        log.info("exclusions ---> " + properties.getExclusions());

        return filterRegistrationBean;
    }
}
