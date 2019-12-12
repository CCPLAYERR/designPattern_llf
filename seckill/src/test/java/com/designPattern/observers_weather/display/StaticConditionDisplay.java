package com.designPattern.observers_weather.display;

import com.designPattern.observers_weather.othr.WeatherData;
import com.designPattern.observers_weather.inf.DisplayElement;
import com.designPattern.observers_weather.inf.Observer;

public class StaticConditionDisplay implements Observer,DisplayElement {
    public StaticConditionDisplay(WeatherData weatherData) {
    }

    @Override
    public void display() {

    }

    @Override
    public void update(float temp, float humidity, float pressure) {

    }
}
