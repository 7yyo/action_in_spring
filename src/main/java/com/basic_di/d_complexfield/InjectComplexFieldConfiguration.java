package com.basic_di.d_complexfield;

import com.basic_dl.bean.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.basic_di.d_complexfield")
public class InjectComplexFieldConfiguration {

    @Bean
    @Autowired
    public Dog dog(@Qualifier("master") Person person) {
        Dog dog = new Dog();
        dog.setName("wangwang");
        dog.setPerson(person);
        return dog;
    }

    @Bean
    public Person master() {
        Person master = new Person();
        master.setName("master");
        return master;
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext((InjectComplexFieldConfiguration.class));
        Dog dog = ctx.getBean(Dog.class);
        System.out.println(dog);
    }

}
