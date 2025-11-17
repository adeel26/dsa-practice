package com.adeel.oop;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(); // Creating Object
        myCar.color = "Red";
        myCar.model = "Civic";

        myCar.stat();

    }
}

// This is a separate class (not public)
class Car {
    String color;
    String model;

    void stat(){
        System.out.println("Car is starting...");
    }
}
