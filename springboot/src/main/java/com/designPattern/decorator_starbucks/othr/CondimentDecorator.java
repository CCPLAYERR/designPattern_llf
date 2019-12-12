package com.designPattern.decorator_starbucks.othr;


//装饰者：调料
//抽象装饰类
public abstract class CondimentDecorator extends Beverage {

    //重新实现getdescription
    public abstract String getDescription();


    //
    @Override
    public double cost() {//计价
        return 0;
    }
}
