package com.shubham.factory;

public class AndroidDeveloper implements Employee {

    @Override
    public int Salary() {
        System.out.println("Android Developer Salary");
        return 60000;
    }

    @Override
    public String name() {
        return "Android Developer";
    }
}
