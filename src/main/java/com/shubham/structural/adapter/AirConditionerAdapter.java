package com.shubham.structural.adapter;

public class AirConditionerAdapter implements SmartDevice {
    private AirConditioner airConditioner;
    public AirConditionerAdapter(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void turnOn() {
        airConditioner.connectViaBluetooth();
        airConditioner.startCooling();
    }

    @Override
    public void turnOff() {
        airConditioner.stopCooling();
        airConditioner.disconnectBluetooth();
    }

}
