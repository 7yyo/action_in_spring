package com.basic_di.g_complexfield;

import com.basic_di.g_complexfield.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.stream.Stream;

public class ComplexApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("basic_dl/complex.xml");
        Person person = applicationContext.getBean(Person.class);
        for (int i = 0; i < person.getNames().length; i++) {
            System.out.println(person.getNames()[i]);
        }
    }

}
