package com.shubham.behavioral.strategy;

public class Navigator {
    private RouteStrategy strategy;
    
    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }
    
    public void navigate(String start, String end) {
        strategy.buildRoute(start, end);
    }
}
