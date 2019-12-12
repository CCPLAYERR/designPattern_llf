package com.designPattern.decorator_starbucks.othr;

public class Whip extends CondimentDecorator {
    Beverage beverage;
    public Whip(Beverage darkRoast) {
        this.beverage =darkRoast;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",水果蛋奶";
    }

    @Override
    public double cost() {
        return beverage.cost()+6.1;
    }
}
