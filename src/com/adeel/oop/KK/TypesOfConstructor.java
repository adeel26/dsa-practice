package com.adeel.oop.KK;

public class TypesOfConstructor {
    public static void main(String[] args) {
        Students st1 = new Students();
        System.out.println(st1.name);
        System.out.println(st1.age);

        Students st2 = new Students("Tony", 30);
        System.out.println(st2.name);
        System.out.println(st2.age);

        Students st3 = new Students(st2);
        System.out.println(st3.name);
        System.out.println(st3.age);

    }
}

class Students{
    String name;
    int age;

    // Default Constructor
    // there is no ambiguity btw local variables and instance variables, so we can skip "this" word.
    Students(){
        System.out.println("Default constructor called");
        name = "Unknown";
        age = 0;
    }

    // Parameterized Constructor
    Students(String name, int age){
        System.out.println("Parameterized constructor called");
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    Students(Students other) {
        System.out.println("Copy constructor called");
        this.name = other.name;
        this.age = other.age;
    }
}

/*
Default constructor:
Note: It is not necessary to write a constructor for a class because the Java compiler automatically creates a default constructor
(a constructor with no arguments) if your class doesn’t have any.
 */


// Private constructor is on another file

// Notes from www.geeksforgeeks.org/java/constructors-in-java/