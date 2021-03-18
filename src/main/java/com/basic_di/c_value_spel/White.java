package com.basic_di.c_value_spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class White {

    @Value("#{blue.name.substring(0, 3)}")
    private String name;

    @Value("#{T(java.lang.Integer).MAX_VALUE}")
    private Integer order;

    public String toString() {
        return "White{" + "name='" + name + '\'' + ", order=" + order + '}';
    }



}
