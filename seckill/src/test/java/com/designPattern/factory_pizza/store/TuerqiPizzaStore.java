package com.designPattern.factory_pizza.store;

import com.designPattern.factory_pizza.factory.SimplePizzaFactory;
import com.designPattern.factory_pizza.pizza.Pizza;
import com.designPattern.factory_pizza.pizza.TuerqiNo1Pizza;
import com.designPattern.factory_pizza.pizza.TuerqiNo2Pizza;

public class TuerqiPizzaStore extends PizzaStore {

    SimplePizzaFactory pizzaFactory;

//    public TuerqiPizzaStore(){
//        System.out.println("》》》》》土耳其披萨《《《《《");
//    }

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("no1".equals(type)) {
            pizza = new TuerqiNo1Pizza();
        } else if ("no2".equals(type)) {
            pizza = new TuerqiNo2Pizza();
        }
        return pizza;
    }
}
