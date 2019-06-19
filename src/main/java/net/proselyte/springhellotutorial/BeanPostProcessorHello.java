package net.proselyte.springhellotutorial;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Выполняется перед инициализацией и после уничтожения экземпляров бина
 */
public class BeanPostProcessorHello implements BeanPostProcessor {

    /**
     * Что именно будет происходить перед инициализацией экземпляра бина
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization method called for: " + beanName);
        return bean;
    }

    /**
     * Что именно будет происходить после уничтожения экземпляра бина
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization method called for: " + beanName);
        return bean;
    }
}
