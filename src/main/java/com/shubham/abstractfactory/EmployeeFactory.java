package com.shubham.abstractfactory;

import com.shubham.abstractfactory.Employee;

public class EmployeeFactory {

    //get the employee
    public static Employee getEmployee(EmployeeAbstractFactory factory) {
        return factory.createEmployee();
    }
}
