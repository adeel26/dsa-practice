package com.adeel.Questions.Array;
// Find Numbers with Even Number of Digits
public class Q_Array16 {
    public static void main(String[] args) {
        int[] nums = {437,315,322,431,686,264,442};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
        int evenCount = 0;

        for (int i = 0; i < nums.length; i++) {
            int digitCount = 0;
            while(nums[i] != 0){
                nums[i] = nums[i] / 10;
                digitCount++;
            }
            if(digitCount % 2 == 0){
                evenCount++;
            }
        }
        return evenCount;
    }
}
