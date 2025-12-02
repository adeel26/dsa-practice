package com.adeel.oop.OtherPath.Polymorphism.Interface;

public class Main {
    public static void main(String[] args) {

        // Polymorphism = "POLY" = "MANY"
        //                "MORPH" = "SHAPE"
        //                Objects can identify as other objects.
        //                Objects can be treated as objects of a common superclass.

        Car car = new Car();
        car.go();

        Bike bike = new Bike();
        bike.go();

        Boat boat = new Boat();
        boat.go();

        Vehicle[] vehicles = {car, bike, boat};
        for(Vehicle v : vehicles) {
            v.go();
        }
    }
}
