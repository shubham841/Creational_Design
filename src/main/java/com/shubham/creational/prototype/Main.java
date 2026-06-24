package com.shubham.creational.prototype;

public class Main {

    //The concept is to copy an existing object rather than creating a new instance from scratch because new object may be costly.
    // This approach saves costly resources and time, especially when object creation is a heavy process.

    public static void main(String[] args) {
        System.out.println("Creating object using prototype pattern");

        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("192.168.1.1");
        networkConnection.loadData();
        System.out.println(networkConnection);

        NetworkConnection clonedConnection = null;
        try{
            clonedConnection=(NetworkConnection) networkConnection.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();

        }
        System.out.println(clonedConnection);

    }


}
