package com.adeel.basic.function;

public class Shadowing {
    static int a = 100; // this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(a); // 100
        int a = 200;  // the class variable at line 4 is shadowed by this
        System.out.println(a); // 200
        fun();
    }

    static void fun(){
        System.out.println(a);
    }
}

// Scope will begin when value is initialized.
// int a; is declaring and a = 99; is initializing