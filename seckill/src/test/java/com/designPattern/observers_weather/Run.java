package com.designPattern.observers_weather;

import com.designPattern.observers_weather.display.CurrentConditionsDisplay;
import com.designPattern.observers_weather.display.ForecastDisplay;
import com.designPattern.observers_weather.display.StaticConditionDisplay;
import com.designPattern.observers_weather.othr.WeatherData;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        //气象站数值 （主题）
        WeatherData weatherData = new WeatherData();

        //创建该对象（观察者）的同时也向主题进行了注册（通过构造方法）
        //创建当前布告板，目的是向主题进行注册，传入的对象即主题
        //构造方法中通过这个主题对象调用主题类中的注册方法registObserver（this）从而把观察者对象传到了主题中，
        CurrentConditionsDisplay cCDisplay = new CurrentConditionsDisplay(weatherData);

        //统计布告板
        StaticConditionDisplay sCDisplay = new StaticConditionDisplay(weatherData);

        //预告布告板
        ForecastDisplay fDisplay = new ForecastDisplay(weatherData);

        //模拟主题的内容发生了改变之后，观察者会做出什么反应？
        //当气象站（主题）数值改变的时候，触发measurementsChanged（）方法；
        //measurementsChanged再调用notifyObservers（）；即通过传过来的观察者对象调用update方法；
        //调用update方法后，气象站（主题）的改变值就传到了布告板（观察者）中
        //改变三次
        weatherData.setMeasurement(23,55,67f);
        Thread.sleep(1000);
        System.out.println("等待更新中。。。。。");
        Thread.sleep(3000);
        weatherData.setMeasurement(87,43,32f);
        Thread.sleep(1000);
        System.out.println("等待更新中。。。。。");
        Thread.sleep(5000);
        weatherData.setMeasurement(53,95,67f);
    }
}
