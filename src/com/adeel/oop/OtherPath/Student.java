package com.adeel.oop.OtherPath;

public class Student {
    // Constructor = A special method to initialize objects
    //               You can pass arguments to a constructor
    //               and set up initial values

    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    // Constructor
    Student() {

    }

    // Constructor
    Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    // Method
    void study(){
        System.out.println(this.name + " is studying");
    }
}
