package com.sample.model;

import com.sample.test.demo.constants.PizzaToppings;
import com.sample.test.demo.constants.PizzaTypes;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderInformation {
    private PizzaTypes pizzaType;
    private PizzaToppings pizzaTopping1;
    private PizzaToppings pizzaTopping2;
    private int quantity;
}

