package com.shubham.behavioral.observer;

public class PhoneDisplay implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("Phone Display: Temperature is " + temperature);
    }
}
