package com.adeel.oop.OtherPath;

public class MethodOverridigMain {
    public static void main(String[] args) {
        // Method overriding = When a subclass provides its own
        //                     implementation of a method that is already defined.
        //                     Allows for code reusability and give specific implementations.

        MethodOverridingDog dog = new MethodOverridingDog();
        MethodOverridingCat cat = new MethodOverridingCat();
        MethodOverridingFish fish = new MethodOverridingFish();

        dog.move();
        cat.move();
        fish.move();

    }
}
