package com.designPattern.factory_pizza.pizza;

import com.designPattern.factory_pizza.factory.PizzaIngredientFactory;

public class AusNo2Pizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;
    public AusNo2Pizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory =pizzaIngredientFactory;
    }

    @Override
    void prepare() {

    }
}
