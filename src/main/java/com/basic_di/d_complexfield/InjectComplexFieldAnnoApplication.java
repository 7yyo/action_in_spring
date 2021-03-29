package com.basic_di.d_complexfield;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InjectComplexFieldAnnoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("com.basic_di.d_complexfield");
        Dog dog = ctx.getBean(Dog.class);
        System.out.println(dog.getPerson().getName());
    }
}
