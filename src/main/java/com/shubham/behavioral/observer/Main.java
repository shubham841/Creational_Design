package com.shubham.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        PhoneDisplay phoneDisplay = new PhoneDisplay();
        
        weatherStation.attach(phoneDisplay);
        
        weatherStation.setTemperature(25);
        weatherStation.setTemperature(30);
    }
}
