package com.shubham.structural.composite;

public class AirConditioner implements SmartComponent {
    @Override
    public void turnOn() {
        System.out.println("Air Conditioner is now ON.");
    }
    @Override
    public void turnOff() {
        System.out.println("Air Conditioner is now OFF.");
    }

}
