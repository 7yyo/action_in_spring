package com.basic_di.c_value_spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Green {

    @Value("#{'copy of ' + blue.name}")
    private String name;
    @Value("#{blue.order + 1}")
    private String order;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String toString() {
        return "Green{" + "name='" + name + '\'' + ", order=" + order + '}';
    }

}
