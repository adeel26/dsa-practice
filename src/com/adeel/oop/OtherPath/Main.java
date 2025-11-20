package com.adeel.oop.OtherPath;

public class Main {
    public static void main(String[] args) {
    

        Car car = new Car();
        car.isRunning = true;

        System.out.println(car.model);
        System.out.println(car.make);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println("******");

        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);
        car.drive();
        car.brake();
    }
}
