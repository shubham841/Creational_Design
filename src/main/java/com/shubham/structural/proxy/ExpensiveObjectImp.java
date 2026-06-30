package com.shubham.structural.proxy;

public class ExpensiveObjectImp implements ExpensiveObject {

    public ExpensiveObjectImp() {
        heavyInitialConfiguration();
    }

    @Override
    public void process() {
        System.out.println("processing complete.");
    }

    private void heavyInitialConfiguration() {
        System.out.println("Loading initial configuration...");
    }

}