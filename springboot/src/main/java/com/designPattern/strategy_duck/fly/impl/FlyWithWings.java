package com.designPattern.strategy_duck.fly.impl;

import com.designPattern.strategy_duck.fly.inf.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println(">>>>>>鸭子挥舞翅膀飞起来了");
    }
}
