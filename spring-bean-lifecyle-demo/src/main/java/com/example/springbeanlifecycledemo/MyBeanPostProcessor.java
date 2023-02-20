package com.example.springbeanlifecycledemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;


@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException{
        System.out.printf("postProcessBeforeInitialization method was executed, beanName = %s%n", beanName);
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException{
        System.out.printf("postProcessAfterInitialization method was executed, beanName = %s%n", beanName);
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

}
