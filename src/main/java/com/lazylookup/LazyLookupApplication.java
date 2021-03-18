package com.lazylookup;

import com.lazylookup.bean.Cat;
import com.lazylookup.bean.Dog;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LazyLookupApplication {

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_dl/quickstart-lazylookup.xml");
        Cat cat = ctx.getBean(Cat.class);
        System.out.println(cat);

        ObjectProvider<Dog> dogProvider = ctx.getBeanProvider(Dog.class);
        Dog dog = dogProvider.getIfAvailable(() -> new Dog());
        System.out.println(dog);
    }

}
