package com.designPattern.decorator_starbucks.othr;

//被装饰类
public class HouseBlend extends Beverage {

    public HouseBlend(){
        description="星巴克百年传承秘制咖啡";
    }

    @Override
    public double cost() {
        return 4.1;
    }
}
