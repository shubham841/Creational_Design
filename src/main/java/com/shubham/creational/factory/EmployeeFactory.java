package com.shubham.creational.factory;

public class EmployeeFactory {

    //get the employee
    public static Employee createEmployee(String name){
        if(name.equals("Android Developer")){
            return new AndroidDeveloper();
        }else if(name.equals("Web Developer")){
            return new WebDeveloper();
        }
        return null;
    }
}
