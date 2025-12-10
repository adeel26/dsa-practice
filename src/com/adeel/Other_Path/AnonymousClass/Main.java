package com.adeel.Other_Path.AnonymousClass;

public class Main {
    public static void main(String[] args) {
        // Anonymous class = A class that doesn't have a name. Cannot be reused.
        //                   Add custom behaviour without having to create a new class.
        //                   Often used for one time uses(TimerTask, Runnable, callbacks)

        Dog dog1 = new Dog();
        dog1.speaks();

        // Anonymous class
        Dog dog2 = new Dog() {

            @Override
            void speaks() {
                System.out.println("Scooby Doo says *Ruh Roh*");
            }

        };

        dog2.speaks();
    }
}
