package com.shubham.behavioral.state;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        State startState = new StartState();
        startState.doAction(context);
        System.out.println("Current State: " + context.getState().toString());

        State stopState = new StopState();
        stopState.doAction(context);
        System.out.println("Current State: " + context.getState().toString());
    }
}
