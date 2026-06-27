package com.shubham.structural.adapter;

public class SmartLight {
    public void connectToWiFi() {
        System.out.println("Smart Light connected to Wi-Fi.");
    }

    // Method to turn the Smart Light on
    public void switchOn() {
        System.out.println("Smart Light is now ON.");
    }

    // Method to turn the Smart Light off
    public void switchOff() {
        System.out.println("Smart Light is now OFF.");
    }

    // Method to disconnect Wi-Fi connection
    public void disconnectWiFi() {
        System.out.println("Smart Light disconnected from Wi-Fi.");
    }
}
