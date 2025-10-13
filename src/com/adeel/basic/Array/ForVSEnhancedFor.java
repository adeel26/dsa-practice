package com.adeel.basic.Array;

public class ForVSEnhancedFor {
    public static void main(String[] args) {
        // Normal For loop
        System.out.println("Normal for loop");
        int[] arr = {10, 20, 30};
        for (int i = 0; i < arr.length; i++){
            System.out.print(i);      // prints index (0, 1, 2)
            // Here i is the index variable, not the array element itself.
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]); // prints value (10, 20, 30)
        }

        System.out.println();
        // Enhanced for loop (for-each)
        // Here num represents the value stored at each index — not the index.
        System.out.println("Enhanced for loop");
        for (int i : arr){
            System.out.print(i); // prints value directly (10, 20, 30)
        }

        System.out.println();
        // If you want both index and value, you can do:

        int index = 0;
        for (int i : arr){
            System.out.println("Index " + index + " = " + i);
            index++;
        }

    }
}

