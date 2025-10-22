package com.adeel.basic.Array;


public class Q2_MaxItem {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};

        System.out.println(Max(arr));
    }

    static int Max(int[] array){
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }
}
