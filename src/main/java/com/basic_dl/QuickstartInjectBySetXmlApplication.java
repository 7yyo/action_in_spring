package com.basic_dl;

import com.basic_dl.bean.Cat;
import com.basic_dl.bean.Person;
import com.basic_dl.oftype.dao.DemoDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class QuickstartInjectBySetXmlApplication {

    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("basic_dl/inject-set.xml");
        Person person = beanFactory.getBean(Person.class);
        System.out.println("Person={name=" + person.getName() + ", age=" + person.getAge() + "}");
        Cat cat = beanFactory.getBean(Cat.class);
        System.out.println("Cat={name=" + cat.getName() + ", master=" + cat.getMaster() + "}");

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("basic_dl/inject-set.xml");
        Map<String, DemoDao> beans = applicationContext.getBeansOfType(DemoDao.class);
        beans.forEach((beanName, bean) -> {
            System.out.println(beanName + ":" + bean.toString());
        });
    }

}
