package com.adeel.Questions;

import java.util.Arrays;
// 1470. Shuffle the Array
public class LeetCodeArray5 {
    public static void main(String[] args) {
        int[] number = {1,2,3,1,2,3,};
        int halfArray = 3;

        System.out.println(Arrays.toString(shuffle(number, halfArray)));
    }

    static int[] shuffle(int[] nums, int n){
        int[] Output = new int[nums.length];
        for (int i = 0; i < n ; i++) {
            Output[2 * i] = nums[i];
            Output[2*i+1] = nums[n+i];
        }

        return Output;
    }
}

/*
🧩 What’s happening

We have:

nums = [1,1,1,1,2,2,2,2]
n = 4
output = [?, ?, ?, ?, ?, ?, ?, ?]   // empty for now

🔹 First iteration → i = 0
output[2*i] = nums[i];         // → output[0] = nums[0]
output[2*i+1] = nums[n+i];     // → output[1] = nums[4]


Now:

output = [1, 2, ?, ?, ?, ?, ?, ?]


So:
You took 1 from the left half (nums[0])
You added it at output[0]
Then took 2 from the right half (nums[4])
And added it at output[1]

🔹 Second iteration → i = 1
output[2*i] = nums[1];      // output[2] = nums[1]
output[2*i+1] = nums[n+1];  // output[3] = nums[5]


Now:

output = [1, 2, 1, 2, ?, ?, ?, ?]

🔹 Third iteration → i = 2
output[4] = nums[2];
output[5] = nums[6];


Now:

output = [1, 2, 1, 2, 1, 2, ?, ?]

🔹 Fourth iteration → i = 3
output[6] = nums[3];
output[7] = nums[7];


Now:

output = [1, 2, 1, 2, 1, 2, 1, 2]

💡 So in short:
Step	Take from	Put at	Why
nums[i]	Left half	output[2*i]	Even positions (0,2,4,6)
nums[n+i]	Right half	output[2*i+1]	Odd positions (1,3,5,7)

That’s why we say:

“Take one from left half and put it at the next even index,
then take one from right half and put it at the next odd index.”
 */