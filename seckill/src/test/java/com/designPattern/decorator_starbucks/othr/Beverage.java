package com.designPattern.decorator_starbucks.othr;

public abstract class Beverage {
    String description = "未知饮料";

    public String getDescription(){
        return description;
    }

    //此抽象方法必须在子类中实现
    public abstract double cost();
}
