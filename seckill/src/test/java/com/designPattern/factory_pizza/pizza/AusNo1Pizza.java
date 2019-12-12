package com.designPattern.factory_pizza.pizza;

import com.designPattern.factory_pizza.factory.PizzaIngredientFactory;

public class AusNo1Pizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;
    public AusNo1Pizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory =pizzaIngredientFactory;
    }


    @Override
    void prepare() {

    }
}
