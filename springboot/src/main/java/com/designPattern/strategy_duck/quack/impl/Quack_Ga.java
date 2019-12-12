package com.designPattern.strategy_duck.quack.impl;

import com.designPattern.strategy_duck.quack.inf.QuackBehavior;

public class Quack_Ga implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println(">>>>>>>>>>这只鸭子开始gagag的叫");
    }
}
