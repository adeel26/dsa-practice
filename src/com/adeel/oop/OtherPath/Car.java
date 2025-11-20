package com.adeel.oop.OtherPath;

public class Car {

    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 58000.99;
    boolean isRunning = false;

    void start() {
        isRunning = true;
        System.out.println("Engine started");
    }

    void stop() {
        isRunning = false;
        System.out.println("Engine stopped");
    }

    void drive() {
        System.out.println("We are driving " + model);
    }

    void brake() {
        System.out.println("We just applied brake on our car " + model);
    }
}
