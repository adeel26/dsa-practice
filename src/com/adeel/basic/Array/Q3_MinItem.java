package com.adeel.basic.Array;

public class Q3_MinItem {
    public static void main(String[] args) {
        int[] arr = {3, 5, 25, 36, 2, 8};
        System.out.println(MinItem(arr));
        System.out.println(MinItemRange(arr, 1, 3));
    }

    static int MinItem(int[] array){
        int Min = array[0];
        for (int i = 1; i < array.length; i++) { // starting from 1 is just a small optimization
            if(array[i] < Min){
                Min = array[i];
            }
        }
        return Min;
    }

    // To find minimum in range
    static int MinItemRange(int[] array, int start, int end){
        int Min = array[start];
        for (int i = start; i < end; i++) { // starting from 1 is just a small optimization
            if(array[i] < Min){
                Min = array[i];
            }
        }
        return Min;
    }

}

/*
No, it’s not a must — your original version starting from i = 0 also works fine ✅.

Here’s why starting from 1 is just a small optimization, not a requirement:
You already set Min = array[0].
When i = 0, the condition if (array[i] < Min) compares the same element (array[0] < array[0]), which is always false.
So, that first comparison is simply redundant, not harmful.

👉 In short:
i = 0 → works correctly (just one extra useless check).
i = 1 → slightly cleaner and avoids that redundant comparison.
 */