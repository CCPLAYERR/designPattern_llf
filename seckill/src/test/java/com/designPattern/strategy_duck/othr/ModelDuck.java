package com.designPattern.strategy_duck.othr;

import com.designPattern.strategy_duck.fly.impl.FlyNoWay;
import com.designPattern.strategy_duck.quack.impl.Quack_Gua;

public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack_Gua();
    }

    @Override
    public void display() {
        System.out.println("我是一只木头做的假鸭子");
    }
}
