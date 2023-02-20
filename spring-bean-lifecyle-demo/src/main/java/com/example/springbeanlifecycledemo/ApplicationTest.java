package com.example.springbeanlifecycledemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationTest {

    public static void main(String[] args) {
        System.out.println("--- Init application context ---");
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.example.springbeanlifecycledemo");
        Person person = applicationContext.getBean(Person.class);
        System.out.println("person=" + person);
        System.out.println("--- destroy application context ---");
        applicationContext.close();
        System.out.println("after application context shutdown, person = " + person);
    }
}
