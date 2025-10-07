package com.adeel.Memory;

public class StringExample {
    public static void main(String[] args) {
        String S1 = "Hello";              // Goes into String Pool
        String S2 = new String("Hello");  // New object in Heap (different reference)
        String S3 = S2.intern();          // Returns pooled reference if already exists otherwise create new one

        System.out.println(S1 == S2); // false → different memory (pool vs heap)
        System.out.println(S1 == S3); // true → both refer to same pooled object
    }
}
/*
🔹 1. String literals go to the String Pool

When you write:

String s1 = "Hello";


✅ The JVM checks the String Pool (in the heap’s special area for strings).

If "Hello" already exists there → it reuses it.

If not → it creates a new "Hello" in the pool.

So "Hello" lives once in the pool.

🔹 2. Using new String("Hello")

When you do:

String s2 = new String("Hello");


you’re explicitly asking Java to create a new String object on the regular heap, even though "Hello" already exists in the String Pool.

Here’s what happens step-by-step:

"Hello" (the literal) is first checked or created in the String Pool — if it’s not already there, it’s added.

Then new String("Hello") creates a new, distinct String object on the heap, which contains the same sequence of characters but is not the same reference as the one in the pool.

So after this line, you have two String objects in memory:

Location	Reference	Description
String Pool	"Hello"	Interned (shared) literal
Heap	new String("Hello")	Separate, non-interned object
🔹 3. Memory flow visualization
String s1 = "Hello";
String s2 = new String("Hello");


Memory looks like this:

String Pool:     "Hello"  ← s1
Heap:             new "Hello"  ← s2


s1 == s2 ❌ (false — different memory locations)
s1.equals(s2) ✅ (true — same content)

🔹 4. What if you call intern() on the new string?
String s3 = s2.intern();


The intern() method returns the reference to the String Pool version of "Hello".

If it didn’t exist before (rare in this case), it adds it to the pool.

So now:

s3 == s1   // true (both refer to the same pooled literal)

🔹 5. Why does Java do this?

Because the String Pool is meant for optimization and reusability — it saves memory and speeds up comparison (==) for literals.

When you use new, you’re explicitly opting out of that reuse — often for testing, immutability, or to guarantee a unique reference.

🔹 6. Summary table
Code	Pool Created?	Heap Object Created?	Notes
String s = "Hi";	✅ Yes (if not existing)	❌ No	Reuses pool
String s = new String("Hi");	✅ Yes (literal checked/created)	✅ Yes	Creates duplicate on heap
String s = new String("Hi").intern();	✅ Yes	✅ then reused from pool	s points to pooled version
 */