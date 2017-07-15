package tk.zhangh.springboot.refresh.beanprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.AnnotatedGenericBeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * Created by ZhangHao on 2017/7/10.
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor, PriorityOrdered {

    public MyBeanDefinitionRegistryPostProcessor() {
        System.out.println("------ MyBeanDefinitionRegistryPostProcessor construct");
    }

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        registry.registerBeanDefinition("simpleBeanWithDefinitionInBeanDefinitionRegistryPostProcessor",
                new AnnotatedGenericBeanDefinition(SimpleBeanWithDefinitionInBeanDefinitionRegistryPostProcessor.class)
        );
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        beanFactory.registerSingleton("simpleBeanInBeanDefinitionRegistryPostProcessor", new SimpleBeanInBeanDefinitionRegistryPostProcessor());
    }

    @Override
    public int getOrder() {
        return 0;
    }

    private class SimpleBeanInBeanDefinitionRegistryPostProcessor {

    }

    private class SimpleBeanWithDefinitionInBeanDefinitionRegistryPostProcessor {

    }
}
