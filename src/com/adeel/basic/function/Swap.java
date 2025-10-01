package com.adeel.basic.function;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Swap numbers
        swapM(a, b); 

    }

    static void swapM(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);
    }
}
