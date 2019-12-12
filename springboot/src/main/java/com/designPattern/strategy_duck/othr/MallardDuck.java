package com.designPattern.strategy_duck.othr;

import com.designPattern.strategy_duck.fly.impl.FlyWithWings;
import com.designPattern.strategy_duck.quack.impl.Quack_Gua;

/**
 * 野鸭
 */
public class MallardDuck extends Duck {
    public MallardDuck(){
         quackBehavior = new Quack_Gua();
         flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("我是一只活着的野鸭");
    }
}
