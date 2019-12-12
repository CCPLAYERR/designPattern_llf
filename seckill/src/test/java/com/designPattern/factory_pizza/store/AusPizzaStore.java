package com.designPattern.factory_pizza.store;

import com.designPattern.factory_pizza.factory.AusPizzaIngredientFactory;
import com.designPattern.factory_pizza.factory.PizzaIngredientFactory;
import com.designPattern.factory_pizza.pizza.AusNo1Pizza;
import com.designPattern.factory_pizza.pizza.AusNo2Pizza;
import com.designPattern.factory_pizza.pizza.AusPizza;
import com.designPattern.factory_pizza.pizza.Pizza;

public class AusPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pif = new AusPizzaIngredientFactory();
        if ("no1".equals(type)) {
            pizza = new AusNo1Pizza(pif);
            pizza.setPizzaName("AUS-NO1-PIZA");
        } else if ("no2".equals(type)) {
            pizza = new AusNo2Pizza(pif);
            pizza.setPizzaName("AUS-NO2-PIZA");
        } else {
            pizza = new AusPizza(pif);
            pif.createCheese();
            pizza.setPizzaName("AUS-PIZA");
        }
        return pizza;
    }

/*    public Pizza createPizza(String type,PizzaIngredientFactory pf) {
        Pizza pizza = null;
        if ("no1".equals(type)) {
            pizza = new AusNo1Pizza();
        } else if ("no2".equals(type)) {
            pizza = new AusNo2Pizza();
        }else {
            pizza = new AusPizza(pf);
        }
        return pizza;
    }*/


}
