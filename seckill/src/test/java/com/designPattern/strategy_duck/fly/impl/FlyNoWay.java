package com.designPattern.strategy_duck.fly.impl;

import com.designPattern.strategy_duck.fly.inf.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println(">>>>>>>>>这只鸭子不会飞");
    }
}
