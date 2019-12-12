package com.designPattern.factory_pizza.factory;

import com.designPattern.factory_pizza.ingredient.*;
import com.designPattern.factory_pizza.ingredient.veggies.Garlic;
import com.designPattern.factory_pizza.ingredient.veggies.Mushroom;
import com.designPattern.factory_pizza.ingredient.veggies.Onion;
import com.designPattern.factory_pizza.ingredient.veggies.Redpepper;

public class AusPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new AusDough();
    }

    @Override
    public Sauce createSauce() {
        return new AusSauce();
    }

    @Override
    public Cheese createCheese() {
        return new AusCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies vg[] ={new Garlic(),new Onion(),new Mushroom(),new Redpepper()};
        return vg;
    }


    @Override
    public Clams createClams() {
        return new AusClams();
    }
}
