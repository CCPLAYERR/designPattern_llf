package com.designPattern.observers_weather.display;

import com.designPattern.observers_weather.inf.DisplayElement;
import com.designPattern.observers_weather.inf.Observer;
import com.designPattern.observers_weather.inf.Subject;

public class HeatindexDisplay implements Observer,DisplayElement {

    public HeatindexDisplay(Subject weatherData){


    }
    @Override
    public void display() {

    }

    @Override
    public void update(float temp, float humidity, float pressure) {

    }
}
