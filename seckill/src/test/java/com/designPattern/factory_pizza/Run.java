package com.designPattern.factory_pizza;

import com.designPattern.factory_pizza.factory.SimplePizzaFactory;
import com.designPattern.factory_pizza.store.AusPizzaStore;
import com.designPattern.factory_pizza.store.PizzaStore;
import com.designPattern.factory_pizza.store.TuerqiPizzaStore;

public class Run {
    public static void main(String[] args) {
        //开店
        PizzaStore pizzaStore = new AusPizzaStore();
        //客人点餐 orderpizza
        pizzaStore.orderPizza("no3");

    }
}
