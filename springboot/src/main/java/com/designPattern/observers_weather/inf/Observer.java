package com.designPattern.observers_weather.inf;

public interface Observer {

    /**
     * 观察者需要实现此类，当气象站获取的值发生改变时，主题会把这些状态值当作方法的参数传递给观察者
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void update(float temp, float humidity, float pressure);
}
