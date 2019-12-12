package com.designPattern.observers_weather.othr;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable {

    private ArrayList observers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers=new ArrayList();
    }

//    @Override
//    public void registerObserver(Observer o) {
//        observers.add(o);
//    }
//
//    @Override
//    public void removeObserver(Observer o) {
//        int index = observers.indexOf(o);
//        if (index>=0){
//            observers.remove(index);
//        }
//    }

//    @Override
//    public void notifyObservers() {
//        for (int i = 0; i < observers.size(); i++) {
//            Observer observer = (Observer) observers.get(i);
//            observer.update(temp,humidity,pressure);
//        }
//    }

    /**
     * 当气象站数值改变时，调用此方法
     */
    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    /**
     * 设置气象站数值
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void setMeasurement(float temp,float humidity,float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure =pressure;
        measurementsChanged();
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
