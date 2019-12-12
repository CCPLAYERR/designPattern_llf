package com.designPattern.decorator_starbucks.othr;

//被装饰者
public class Espresso extends Beverage {

    public Espresso(){
        description="浓缩咖啡";
    }

    @Override
    public double cost() {
        return 5.3;
    }
}
