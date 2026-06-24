package com.shubham.creational.abstractfactory;

public class EmployeeFactory {

    //get the employee
    public static Employee getEmployee(EmployeeAbstractFactory factory) {
        return factory.createEmployee();
    }
}
