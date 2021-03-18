package com.annotation;


import com.basic_dl.bean.Cat;
import com.basic_dl.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.basic_dl.bean")
public class QuickstartConfiguration {

    public Person person() {
        Person person = new Person("Tom",18);
        return person;
    }

    public Cat cat() {
        Cat cat = new Cat();
        cat.setName("Tomm");
        cat.setMaster(person());
        return cat;
    }


}
