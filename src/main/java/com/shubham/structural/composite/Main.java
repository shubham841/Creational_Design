package com.shubham.structural.composite;

public class Main {

    public static void main(String[] args) {

        //This pattern helps in scenarios where we have object inside object(tree like structure)


        SmartComponent airConditioner = new AirConditioner();
        SmartComponent smartLight = new SmartLight();


        //Create room and add devices
        CompositeSmartComponent room1 = new CompositeSmartComponent();
        room1.addComponent(airConditioner);
        room1.addComponent(smartLight);

        CompositeSmartComponent room2 = new CompositeSmartComponent();
        room2.addComponent(airConditioner);
        room2.addComponent(smartLight);

        CompositeSmartComponent floor = new CompositeSmartComponent();
        floor.addComponent(room1);
        floor.addComponent(room2);

        CompositeSmartComponent house = new CompositeSmartComponent();
        house.addComponent(floor);

        //Controlling the entire house
        house.turnOn();
        house.turnOff();

        //controlling the single floor
        floor.turnOn();
        floor.turnOff();

        //controlling the single rooms
        room2.turnOn();
        room2.turnOff();





    }
}
