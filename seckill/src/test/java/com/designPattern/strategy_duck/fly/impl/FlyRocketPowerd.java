package com.designPattern.strategy_duck.fly.impl;

import com.designPattern.strategy_duck.fly.inf.FlyBehavior;

public class FlyRocketPowerd implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println(">>>>>>>>>>>乘着火箭飞起来了");
    }
}
