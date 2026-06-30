package com.shubham.structural.proxy;

public class ExpensiveObjectProxy implements ExpensiveObject{
    private static ExpensiveObject object;

    @Override
    public void process() {
        if (object == null) {
            object = new ExpensiveObjectImp();
        }
        object.process();
    }
}
