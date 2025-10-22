package com.adeel.basic.Array;


public class Q2_MaxItem {
    public static void main(String[] args) {
        int[] arr = {1, 3, 18, 9, 23};

        System.out.println(Max(arr));

        System.out.println(MaxInRange(arr, 1, 3));
    }

    // Imagine array is not empty
    static int Max(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    // Max value from index 1 to 3, Range question
    static int MaxInRange(int[] array, int start, int end){
        int max = array[start];
        for (int i = start; i <= end; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
