package com.adeel.basic.function;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // Create an array
        int[] arr = {1, 3, 77, 92, 2};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums) {
        nums[0] = 99;
    }
}
