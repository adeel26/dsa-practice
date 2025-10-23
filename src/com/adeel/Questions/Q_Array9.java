package com.adeel.Questions;
import java.util.Arrays;

// Create Target Array in the Given Order
public class Q_Array9 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }

    static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int insertPos = index[i];

            for (int j = i; j > insertPos; j--) {
                target[j] = target[j - 1];
            }

            target[insertPos] = nums[i];
        }

        return target;
    }
}
