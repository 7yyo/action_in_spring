package com.basic_di.d_complexfield;

import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentHashMap;

@Component("administrator")
public class Person {

    private String name = "administrator";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
