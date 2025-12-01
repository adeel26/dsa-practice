package com.adeel.oop.OtherPath.Inheritance;

public class Main {
    public static void main(String[] args) {
        // Inheritance = One class inherits the attributes and methods
        //               from another class.
        //               Child <- Parent <- Grandparent

        Dog dog = new Dog();
        Cat cat = new Cat();

        // Accessing methods and instance from parent class
        System.out.println(dog.isAlive);
        dog.eat();

        System.out.println(cat.isAlive);
        cat.eat();

        // Accessing methods and instance from own class (Child Classes)
        System.out.println(dog.lives);
        System.out.println(cat.lives);

        dog.speak();
        cat.speak();

        Plant plant = new Plant();
        System.out.println(plant.isAlive);
        plant.photosynthesis();
    }
}
