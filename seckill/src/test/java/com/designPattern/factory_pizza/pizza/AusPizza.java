package com.designPattern.factory_pizza.pizza;

import com.designPattern.factory_pizza.factory.PizzaIngredientFactory;
import com.designPattern.factory_pizza.ingredient.*;
import com.designPattern.factory_pizza.store.PizzaStore;

public class AusPizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;
    public AusPizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory =pizzaIngredientFactory;
    }

    @Override
    void prepare() {//原料准备
        System.out.println("澳大利亚风味披萨开始prepare>>>>");
        Cheese cheese = pizzaIngredientFactory.createCheese();//奶酪
        Clams clams = pizzaIngredientFactory.createClams();//蛤蜊
        Dough dough = pizzaIngredientFactory.createDough();//面团
        Sauce sauce = pizzaIngredientFactory.createSauce();//酱汁
        Veggies[] veggies = pizzaIngredientFactory.createVeggies();//蔬菜
    }
}
