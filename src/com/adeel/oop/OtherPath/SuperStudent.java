package com.adeel.oop.OtherPath;

public class SuperStudent extends SuperPerson{
    double gpa;

    SuperStudent(String first, String last, double gpa) {
        super(first, last);
        this.gpa = gpa;
    }

    void showGPA() {
        System.out.println(this.first + "'s gpa is: " + this.gpa);
    }
}
