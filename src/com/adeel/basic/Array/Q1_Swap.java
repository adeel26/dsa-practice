package com.adeel.basic.Array;

import java.util.Arrays;

public class Q1_Swap {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};

        System.out.println(Arrays.toString(arr));

        Swap(arr, 1, 4);
        System.out.println(Arrays.toString(arr));

    }

    static void Swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
