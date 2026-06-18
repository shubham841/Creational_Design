package com.shubham.abstractfactory;

public class WebDevFactory extends EmployeeAbstractFactory {

    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
}
