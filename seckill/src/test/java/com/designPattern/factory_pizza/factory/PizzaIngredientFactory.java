package com.designPattern.factory_pizza.factory;

import com.designPattern.factory_pizza.ingredient.*;

public interface PizzaIngredientFactory {
    public Dough createDough();//面团
    public Sauce createSauce();//酱汁
    public Cheese createCheese();//奶酪
    public Veggies[] createVeggies();//蔬菜
   // public Peperoni createPeperoni();//意大利辣香肠
    public Clams createClams();//蛤蜊
}
