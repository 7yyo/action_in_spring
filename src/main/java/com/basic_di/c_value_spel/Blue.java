package com.basic_di.c_value_spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Blue {
    @Value("#{'blue-value-byspel'}")
    private String name;
    @Value("#{2}")
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
        return "Blue{" + "name='" + name + '\'' + ", order=" + order + '}';
    }
}
