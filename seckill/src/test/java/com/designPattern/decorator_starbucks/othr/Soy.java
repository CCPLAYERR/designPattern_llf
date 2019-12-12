package com.designPattern.decorator_starbucks.othr;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage b) {
       this.beverage = b;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",豆浆";
    }

    @Override
    public double cost() {
        return beverage.cost()+3.9;
    }
}
