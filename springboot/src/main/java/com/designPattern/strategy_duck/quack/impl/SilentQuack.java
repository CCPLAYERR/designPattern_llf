package com.designPattern.strategy_duck.quack.impl;

import com.designPattern.strategy_duck.quack.inf.QuackBehavior;

public class SilentQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println(">>>>>>>>>>这只鸭子不会叫，不能发出声音，");
    }
}
