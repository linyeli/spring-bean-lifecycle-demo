package com.example.springbeanlifecycledemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean(name="person", initMethod = "doInit", destroyMethod = "doDestroy")
    public Person createPerson() {
        Person p = new Person("pName", 10);
        return p;
    }
}
