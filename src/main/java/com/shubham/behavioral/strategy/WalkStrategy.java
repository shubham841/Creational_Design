package com.shubham.behavioral.strategy;

public class WalkStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String start, String end) {
        System.out.println("Building walking route from " + start + " to " + end);
    }
}
