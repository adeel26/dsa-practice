package com.adeel.oop;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(); // Creating Object
        myCar.color = "Red";
        myCar.model = "Civic";

        myCar.stat();

        //GameClass
        GamesClass game1 = new GamesClass();
        game1.name = "IGI";
        game1.genre = "Action";

        game1.play();

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

// new word for creating object dynamically allocates memory and return a reference variable to it.