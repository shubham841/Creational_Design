package com.shubham.factory;

public class DeveloperClient {
    public static void main(String[] args) {

        Employee employee = EmployeeFactory.createEmployee("Android Developer");
        assert employee != null;
        System.out.println("Employee Salary " + employee.Salary());


        //
        //1. Focus on creating object for interface rather than implementation
        // Hume farak nhi padhta kese create karenge object ko for particular developer woh factory class dekhegi
        //2. Loose coupling, more robust code


    }
}
