package com.shubham.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        Navigator navigator = new Navigator();
        
        navigator.setStrategy(new DriveStrategy());
        navigator.navigate("Home", "Office");
        
        navigator.setStrategy(new WalkStrategy());
        navigator.navigate("Park", "Cafe");
    }
}
