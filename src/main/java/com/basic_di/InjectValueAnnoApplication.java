package com.basic_di;

import com.basic_di.c_value_spel.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.basic_di.c_value_spel")
public class InjectValueAnnoApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("com.basic_di.c_value_spel");
        Black black = ctx.getBean(Black.class);
        System.out.println("simple value :" + black);
        ApplicationContext ctx1 = new AnnotationConfigApplicationContext("com.basic_di.c_value_spel");
        Red red = ctx.getBean(Red.class);
        System.out.println("simple value :" + red);
        ApplicationContext ctx2 = new AnnotationConfigApplicationContext("com.basic_di.c_value_spel");
        Blue blue = ctx.getBean(Blue.class);
        System.out.println("simple value :" + blue);
        ApplicationContext ctx3 = new AnnotationConfigApplicationContext("com.basic_di.c_value_spel");
        Green green = ctx.getBean(Green.class);
        System.out.println("simple value :" + green);
        ApplicationContext ctx4 = new AnnotationConfigApplicationContext("com.basic_di.c_value_spel");
        White white = ctx.getBean(White.class);
        System.out.println("simple value :" + white);
    }
}
