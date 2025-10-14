package com.adeel.basic.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 233;
        arr[3] = 543;
        arr[4] = 3;
        // [23, 45, 233, 543, 3]

        System.out.println(arr[3]);

        // input using for loop
        int[] customArray = new int[5];
        for (int i = 0; i < customArray.length; i++){
            System.out.print("Enter array date for index " + i + " = ");
            customArray[i] = input.nextInt();
        }
        System.out.println(customArray[3]);

        // Print using for loop
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Print using enhanced loop
        for( int i : arr) {
            System.out.println(i + "");
        }

        // array of objects
        String [] names = new String[5];
        for ( int i = 0; i < names.length; i++){
            System.out.print("Enter students names: ");
            names[i] = input.next();
        }
        System.out.println("\n" + Arrays.toString(names));
    }
}
