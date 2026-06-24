package com.shubham.behavioral.strategy;

public class DriveStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String start, String end) {
        System.out.println("Building driving route from " + start + " to " + end);
    }
}
