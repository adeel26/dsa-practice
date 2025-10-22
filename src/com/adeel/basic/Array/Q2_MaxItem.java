package com.adeel.basic.Array;


public class Q2_MaxItem {
    public static void main(String[] args) {
        int[] arr = {1, 3, 18, 9, 23};

        System.out.println(Max(arr));

        System.out.println(MaxInRange(arr, 1, 3));
    }

    // Imagine array is not empty
    static int Max(int[] array){
        // edge cases
        if (array == null || array.length == 0) {
            return 0;  // or return -1
        }

        // logic
        int max = array[0];
        for (int i = 1; i < array.length; i++) { // starting from 1 is just a small optimization
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    // Max value from index 1 to 3, Range question
    static int MaxInRange(int[] array, int start, int end){
        // edge cases
        if ( array == null || array.length == 0 ) {
            System.out.println("Array cannot be null or empty");
            return 0;  // or return -1
        }
        if ( start < 0 || start > end || end >= array.length ) {
            return 0;  // or return -1
        }

        //logic
        int max = array[start];
        for (int i = start; i <= end; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
