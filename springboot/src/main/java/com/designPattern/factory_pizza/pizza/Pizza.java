package com.designPattern.factory_pizza.pizza;

import com.designPattern.factory_pizza.ingredient.*;

import java.util.Arrays;

public  abstract class Pizza {
    String pizzaName;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Peperoni peperoni;
    Clams clams;


//    public void prepare() {
//        System.out.println("开始准备制作"+pizzaName+"所需要的原材料。。。");
//    }
    abstract void prepare();

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaName='" + pizzaName + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", peperoni=" + peperoni +
                ", clams=" + clams +
                '}';
    }

    public void bake() {
        System.out.println("开始烘培披萨...");
    }

    public void cut() {
        System.out.println("把烤好的披萨切成块...");
    }

    public void box() {
        System.out.println("披萨装到盒子里，等待送餐...");
    }
}
