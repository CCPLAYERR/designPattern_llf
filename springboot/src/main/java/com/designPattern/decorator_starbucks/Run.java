package com.designPattern.decorator_starbucks;

import com.designPattern.decorator_starbucks.othr.*;


public class Run {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription()+",价格："+espresso.cost());
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        Beverage darkRoast = new DarkRoast();//description:焦土咖啡
        darkRoast = new Mocha(darkRoast);//摩卡
        darkRoast = new Whip(darkRoast);//
        System.out.println(darkRoast.getDescription()+",价格："+darkRoast.cost());
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Soy(houseBlend);
        System.out.println(houseBlend.getDescription()+",价格："+houseBlend.cost());
    }
}
