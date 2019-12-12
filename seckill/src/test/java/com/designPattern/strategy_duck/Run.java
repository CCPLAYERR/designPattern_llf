package com.designPattern.strategy_duck;

import com.designPattern.strategy_duck.fly.impl.FlyRocketPowerd;
import com.designPattern.strategy_duck.othr.Duck;
import com.designPattern.strategy_duck.othr.MallardDuck;
import com.designPattern.strategy_duck.othr.ModelDuck;

public class Run {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();
        System.out.println("_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+");
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowerd());
        modelDuck.performFly();
    }
}
