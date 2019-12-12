package com.designPattern.observers_weather.display;

import com.designPattern.observers_weather.inf.DisplayElement;
import com.designPattern.observers_weather.othr.WeatherData;

import java.util.Observable;

public class CurrentConditionsDisplay implements DisplayElement, java.util.Observer {
    private float temp;
    private float humidity;
    private Observable observable;

    /**
     * 构造方法，创建这个类的实例时就进行了注册
     */
    public CurrentConditionsDisplay(Observable o){
        this.observable = o;
        //观察者进行注册
        o.addObserver(this);
        //weatherData.registerObserver();
    }
    @Override
    public void display() {
        System.out.println("当前温度： "+temp);
        System.out.println("当前湿度： "+humidity);
    }

//    @Override
//    public void update(float temp, float humidity, float pressure) {
//        this.temp =temp;
//        this.humidity =humidity;
//        display();
//    }

    @Override
    public void update(Observable o, Object arg) {
        //判断左边的对象是否是右边类的实例
        if(o instanceof WeatherData){
            this.temp = ((WeatherData) o).getTemp();
            this.humidity = ((WeatherData) o).getHumidity();
            display();
        }
    }
}
