package com.shubham.abstractfactory;

public class Client {
    public static void main(String[] args) {

        //Get android developer
        Employee e1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
        System.out.println("Employee Name: " + e1.name());
        System.out.println("Employee Salary: " + e1.Salary());

    }
}
