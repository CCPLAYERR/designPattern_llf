package com.designPattern.strategy_duck.othr;


import com.designPattern.strategy_duck.fly.inf.FlyBehavior;
import com.designPattern.strategy_duck.quack.inf.QuackBehavior;

public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    //设置飞行行为
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    //设置叫声
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }

    //叫
    public void performQuack(){
        quackBehavior.quack();
    };

    //飞
    public void performFly(){
        flyBehavior.fly();
    };

    //显示
    public abstract void display();

    public void swim(){
        System.out.println(">>>>>>>>>>>>所有的鸭子都能浮在水面，包括木头鸭子！");
    }
}
