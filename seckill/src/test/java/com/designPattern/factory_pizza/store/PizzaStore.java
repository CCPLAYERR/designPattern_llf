package com.designPattern.factory_pizza.store;

import com.designPattern.factory_pizza.pizza.Pizza;

public abstract class PizzaStore {
    //SimplePizzaFactory pizzaFactory;

    /*public PizzaStore(SimplePizzaFactory pizzaFactory){
        this.pizzaFactory =pizzaFactory;
    }*/

    public Pizza orderPizza(String type){
        //创建披萨
        Pizza pizza;
        pizza = createPizza(type);
        //加工披萨
        //pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
