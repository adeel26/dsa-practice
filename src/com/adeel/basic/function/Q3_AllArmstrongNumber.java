package com.adeel.basic.function;

public class Q3_AllArmstrongNumber {
    public static void main(String[] args) {
        printAllArmstrong();
    }

    static void printAllArmstrong(){
        System.out.println("Print all armstrong numbers from 100 till 999");

        for(int i = 100; i <= 999; i++){
            int orginal = i;
            int temp = i;
            int sum = 0;

            while(temp > 0){
                int rem = temp % 10;
                temp = temp / 10;
                sum = sum + rem * rem * rem;
            }
            if(sum == orginal){
                System.out.println(orginal);
            }
        }
    }
}

/*
    static void printAllArmstrong() {
        System.out.println("All Armstrong numbers between 100 and 999 are:");

You created a static method (so you can call it directly from main()).

It prints a simple message before starting.

        for (int i = 100; i <= 999; i++) {

A for loop that runs from 100 to 999 —
meaning you’ll check every 3-digit number.

            int original = i;
            int temp = i;
            int sum = 0;


original stores the current number — you’ll need this later for comparison.

temp is used for calculations so you don’t modify i directly.

sum will hold the sum of the cubes of each digit.

            while (temp > 0) {
                int rem = temp % 10;
                sum = sum + (rem * rem * rem);
                temp = temp / 10;
            }


The while loop extracts each digit from right to left using % 10.
Example for 153:

rem = 3, sum = 27
rem = 5, sum = 27 + 125 = 152
rem = 1, sum = 152 + 1 = 153

Then temp = temp / 10 removes the last digit each time.
So after this loop, sum contains the sum of cubes of all digits.

            if (sum == original) {
                System.out.println(original);
            }

Now compare:
If the cube-sum equals the original number → it’s an Armstrong number.
Then print it.

✅ Output:
All Armstrong numbers between 100 and 999 are:
153
370
371
407
 */