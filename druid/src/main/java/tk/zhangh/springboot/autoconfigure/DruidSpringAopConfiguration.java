package tk.zhangh.springboot.autoconfigure;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.spring.stat.DruidStatInterceptor;
import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.aop.support.RegexpMethodPointcutAdvisor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

/**
 * Druid Spring监控配置
 * Created by ZhangHao on 2017/6/22.
 */
@ConditionalOnClass(DruidDataSource.class)
@ConditionalOnProperty(prefix = "druid.monitor", havingValue = "enabled", value = "enabled")
public class DruidSpringAopConfiguration {
    @Value("${spring.aop.proxy-target-class:false}")
    private boolean proxyTargetClass;

    @Bean
    public Advice advice() {
        return new DruidStatInterceptor();
    }

    @Bean
    public Advisor advisor(DruidMonitorProperties properties) {
        return new RegexpMethodPointcutAdvisor(properties.getAopPatterns(), advice());
    }

    @Bean
    public DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator() {
        DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
        advisorAutoProxyCreator.setProxyTargetClass(proxyTargetClass);
        return advisorAutoProxyCreator;
    }
}
