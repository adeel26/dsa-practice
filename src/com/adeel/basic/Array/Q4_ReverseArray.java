package com.adeel.basic.Array;

import java.util.Arrays;

public class Q4_ReverseArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12};
        // ReverseArray(arr);
        // ReverseArray2(arr);
        ReverseArray3(arr);
    }


    static void ReverseArray(int[] array){
        int[] rev = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            rev[i] = array[array.length - 1 - i];
        }
        System.out.println(Arrays.toString(rev));
    }
/*
ReverseArray()
arr.length - 1 is the last index of arr (here 5 - 1 = 4). Subtract i to move leftwards from the end as i grows.
So when i changes:

i = 0: arr.length - 1 - i = 4 → rev[0] = arr[4] = 5
i = 1: arr.length - 1 - i = 3 → rev[1] = arr[3] = 4
i = 2: arr.length - 1 - i = 2 → rev[2] = arr[2] = 3
i = 3: arr.length - 1 - i = 1 → rev[3] = arr[1] = 2
i = 4: arr.length - 1 - i = 0 → rev[4] = arr[0] = 1

So rev becomes: {5, 4, 3, 2, 1} — exactly the original reversed.
 */


    static void ReverseArray2(int[] array){
        int start = 0; // index position of first element
        int end =  array.length-1; // array.length gives actual number of elements in array, not the last index

        while (start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++; // move right
            end--;   // move left
        }
        for (int n : array){
            System.out.print(n + " ");
        }
    }



    static void ReverseArray3(int[] array){
        int[] rev = new int[array.length]; // new aray of same size
        int j = array.length - 1; // pointer to the end of array

        for (int i = 0; i < array.length; i++) {
            rev[i] = array[j]; // copy value from array[j] to rev[i]
            j--; // move j leftwards
        }
        System.out.println(Arrays.toString(rev));
    }
    // It creates a new array (rev), and fills it from left to right,
    // while reading the original array (arr) from right to left.

    // Why it’s still called two-pointer approach
    // i → moves forward from start (0 → end)
    // j → moves backward from end (length−1 → 0)
    // Each loop iteration uses both pointers to access and copy elements from opposite ends.


}

