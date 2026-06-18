package com.shubham.factory;

public class WebDeveloper implements Employee {

    @Override
    public int Salary() {
        System.out.println("Web Developer Salary");
        return 50000;
    }

    @Override
    public String name() {
        return "Web Developer";
    }
}
