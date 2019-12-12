package com.designPattern.factory_pizza.store;

import com.designPattern.factory_pizza.pizza.*;
import com.designPattern.factory_pizza.store.PizzaStore;

public class OtherTypePizzaStore extends PizzaStore {
    public OtherTypePizzaStore(){
        System.out.println("》》》》》随便披萨《《《《《");

    }

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("no1".equals(type)) {
            pizza = new OtherTypeNo1Pizza();
        } else if ("no2".equals(type)) {
            pizza = new OtherTypeNo2Pizza();
        }
        return pizza;
    }
}
