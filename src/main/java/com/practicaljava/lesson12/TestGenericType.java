package com.practicaljava.lesson12;

public class TestGenericType {

    public static void main(String[] args) {

        Ferry ferry = new Ferry();

        // Load a truck with two bikes
        Truck<Bike> bikes = new Truck <> ();
        bikes.add(new Bike());
        bikes.add(new Bike());

        // Load a truck with three wheels
        Truck <Wheel> wheels = new Truck<>();
        Wheel wheel = new Wheel();
        wheels.add(new Wheel());
        wheels.add(new Wheel());
        wheels.add(new Wheel());

        // Load two truck on the ferry
        ferry.loadTruck(bikes);
        ferry.loadTruck(wheels);

        // shipment.add(bike);
        // shipment.add(wheel);
        // shipment.add(person);
    }
}
