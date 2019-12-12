package com.designPattern.strategy_duck.quack.impl;

import com.designPattern.strategy_duck.quack.inf.QuackBehavior;

public class Quack_Gua implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println(">>>>>>>>鸭子开始guaguagua叫");
    }
}
