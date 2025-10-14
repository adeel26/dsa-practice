package com.adeel.basic.Array;

import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] nums = {3, 4, 55, 12};
        System.out.println(Arrays.toString(nums));

        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] array){
        array[0] = 99;
    }

}
