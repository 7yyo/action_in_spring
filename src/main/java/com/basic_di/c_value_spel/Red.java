package com.basic_di.c_value_spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:properties/red.properties")
public class Red {

    @Value("${red.name}")
    private String name;
    @Value("${red.order}")
    private Integer order;

    public String toString() {
        return "Red{" + "name='" + name + '\'' + ", order=" + order + '}';
    }

}
