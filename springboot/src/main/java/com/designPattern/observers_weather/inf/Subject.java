package com.designPattern.observers_weather.inf;

public interface Subject {
    /**
     * 观察者注册
     * @param o
     */
    public void registerObserver(Observer o);

    /**
     * 观察者移除
     * @param o
     */
    public void removeObserver(Observer o);

    /**
     * 主题用来提醒观察者的方法
     */
    public void notifyObservers();
}
