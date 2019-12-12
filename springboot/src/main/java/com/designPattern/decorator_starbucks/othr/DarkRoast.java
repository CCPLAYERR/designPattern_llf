package com.designPattern.decorator_starbucks.othr;


//被装饰者
public class DarkRoast extends Beverage {

    public DarkRoast(){
        description = "焦土咖啡";
    }

    @Override
    public double cost() {
        return 6.8;
    }
}
