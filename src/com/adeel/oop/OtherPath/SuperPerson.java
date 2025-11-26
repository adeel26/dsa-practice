package com.adeel.oop.OtherPath;

public class SuperPerson {
    String first;
    String last;

    SuperPerson(String first, String last) {
        this.first = first;
        this.last = last;
    }

    void showName() {
        System.out.println(this.first + " " + this.last);
    }
}
