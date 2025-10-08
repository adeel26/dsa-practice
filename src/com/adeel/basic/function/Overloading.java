package com.adeel.basic.function;

import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        Sum(3, 5, 7);
        Sum(77, 54, 2, 5);

        go(7, 8, 8);
        go("Adeel", "Iqbal");
    }

    //-------------------------------------------------------------------
    static void Sum(int a, int b, int c){
        System.out.println("First method with 3 integer arguments");
        System.out.println(a + b + c);
    }

    static void Sum(int a, int b, int c, int d){
        System.out.println("First method with 4 integer arguments");
        System.out.println(a + b + c + d);
    }
    //-------------------------------------------------------------------

    static void go(int ...abc){
        System.out.println("go method with multiple integer arguments");
        System.out.println(Arrays.toString(abc));
    }

    static void go(String ...abc){
        System.out.println("go method with multiple string arguments");
        System.out.println(Arrays.toString(abc));
    }


}

/*
    static void Sum(int ...nums){
        int total= 0;
        for(int i = 0; i < nums.length; i++){
            total = total + nums[i];
        }
        System.out.println(total);
*/