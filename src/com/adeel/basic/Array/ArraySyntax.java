package com.adeel.basic.Array;

public class ArraySyntax {
    public static void main(String[] args) {

        // Method 1: Using new Keyword
        int[] arr1 = new int[3];
        arr1[0] = 5;
        arr1[1] = 10;
        arr1[2] = 12;

        // Method 2: Direct initialization
        int[] arr2 = {2,4,10};

        // Printing both
        System.out.println("First element of arr1: " + arr1[0]);
        System.out.println("First element of arr2: " + arr2[0]);
    }
}

/*
In Java, there are two main ways to create an array:
🔹 1. Using the new keyword
This is the explicit way — you define the type, size, and optionally fill later.

int[] numbers = new int[5];  // creates an array of size 5
numbers[0] = 10;
numbers[1] = 20;

🧩 What happens here:
Memory is allocated for 5 integers.
All values start as 0 (default).
You fill elements later.
✅ Output example:
numbers = [10, 20, 0, 0, 0]

🔹 2. Direct initialization (shortcut method)
Here, you create and fill the array in one line, without using new.
int[] numbers = {10, 20, 30, 40, 50};

🧩 What happens here:
Java internally uses new behind the scenes:
int[] numbers = new int[]{10, 20, 30, 40, 50};
But you don’t have to write new — it’s shorthand.

⚙️ When to use which:
Use Case	Recommended Way
You know values at creation	{10, 20, 30} ✅
You only know the size, not values yet	new int[5] ✅
 */

// ------------------------------------------------------------------------------------------------
/*
Memory Concept Recap:
int arr3; // Declaration of array. arr3 is getting defined in stack.
arr3 = new int[5]; // Initialization. Object is created in heap.
In Java:
Stack → stores variable references (like arr1, arr2)
Heap → stores actual objects, such as arrays or class instances

🔹 Step-by-Step Memory Visualization
🧱 1. Using new int[3]
Stack                     Heap
------------------         ---------------------
arr1  ───────────────▶     [ 5, 10, 15 ]
                          (array object)
Explanation:
arr1 (reference) is stored in the stack.
The actual array [5, 10, 15] lives in the heap.
When you write arr1[1] = 10;, Java goes to the heap and changes that value.

🧱 2. Using direct {5, 10, 15}
Stack                     Heap
------------------         ---------------------
arr2  ───────────────▶     [ 5, 10, 15 ]
                          (array object)
Explanation:
It looks the same in memory!
Behind the scenes, Java internally still does:
int[] arr2 = new int[]{5, 10, 15};
So both end up with an array object stored in the heap — just created differently.

🧩 Final Visualization (Both Together)
Stack                     Heap
------------------         ---------------------
arr1 ───────────────▶     [ 5, 10, 15 ]  (array 1)
arr2 ───────────────▶     [ 5, 10, 15 ]  (array 2)
Even though both arrays look the same, they are two different objects with different memory addresses in the heap.
 */