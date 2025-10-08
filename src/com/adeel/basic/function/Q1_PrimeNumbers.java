package com.adeel.basic.function;

import java.util.Scanner;

public class Q1_PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter number to check if its prime number or not: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        // isPrime(num);
        CheckPrime(num);
    }

    // Simple program which will check possible divisor until found any
    static void isPrime(int number){
        boolean check = true;
        for(int i = 2; i < number; i++){
                if (number % i == 0){
                    check = false;
                    break;
                }
            }
        if(check){
            System.out.println(number + " is prime number");
        }
        else{
            System.out.println(number + " not prime number");
        }
        }

    // Efficient method to check prime number
    static void CheckPrime(int number){
        if (number < 2){
            System.out.println(number + " is not a prime number.");
            return;  // Ends the entire method immediately. Nothing below it in that method will run.
        }

        boolean prime = true;
        int divisior = 2;

        while (divisior * divisior <= number){
            if(number % divisior == 0){
                prime = false;
                break;  // Stops only the nearest loop (for, while, or do-while). Code after the loop still runs.
            }
            divisior++;
        }
        if(prime){
            System.out.println(number + " is prime number");
        }
        else{
            System.out.println(number + " is not prime number");
        }


    }

}

/*
Second Method
✅ Meaning:
We only check divisors up to the square root of n (√n).

✅ Why:
Because if n has a divisor greater than √n,
then the corresponding other divisor will be smaller than √n.
So, by the time we reach √n, we’ve already checked all possible smaller divisors.

--------------------------

🔹 The key idea
If a number n is not prime, it can be written as
n = a × b

Now notice this:

If both a and b were greater than √n,
then their product would be greater than n, which is impossible.

So at least one of them must be ≤ √n.

👉 This means:
If n has any divisor other than 1 and itself,
one of them will be ≤ √n.

🔹 Example
Take n = 36

√36 = 6
The pairs of factors are:

1 × 36
2 × 18
3 × 12
4 × 9
6 × 6


After 6, the pairs just repeat in reverse:

9 × 4
12 × 3
18 × 2
36 × 1

So you only need to check divisors up to 6, not all the way to 35.

🔹 Why we write divisor * divisor <= number

Because instead of calculating the actual square root (which is a slow floating-point operation),
we just compare:
divisor * divisor <= number
That’s the same as:
divisor <= √number
but faster and without using Math.sqrt().

✅ In short:
We only loop while divisor * divisor <= number because:
If no divisor ≤ √n divides n,
then no divisor > √n can divide it either.
So the number must be prime.
 */