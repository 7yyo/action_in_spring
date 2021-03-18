package com.annotation;

import com.basic_dl.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.stream.Stream;

public class AnnotationConfigApplication {

    public static void main(String[] args) {
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(QuickstartConfiguration.class);
        ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_dl/inject-set.xml");
        Person person = ctx.getBean(Person.class);
        String[] beanNames = ctx.getBeanDefinitionNames();
        Stream.of(beanNames).forEach(System.out::println);
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }

}
