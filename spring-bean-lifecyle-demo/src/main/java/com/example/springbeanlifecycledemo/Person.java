package com.example.springbeanlifecycledemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Person implements BeanFactoryAware, BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {

    private String name;

    private int age;

    private BeanFactory beanFactory;

    private ApplicationContext applicationContext;

    private String beanName;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person Constructor was Executed");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("setName method was executed");
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("setAge method was executed");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
        System.out.println("setBeanFactory method was executed");
    }

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
        System.out.println("setBeanName method was executed");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy method was executed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet method was executed");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        System.out.println("setApplicationContext method was executed");
    }

    public void doInit(){
        System.out.println("doInit method was executed");
    }

    public void doDestroy(){
        System.out.println("doDestroy method was executed");
    }

}
