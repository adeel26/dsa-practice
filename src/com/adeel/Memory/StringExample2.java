package com.adeel.Memory;

public class StringExample2 {
    public static void main(String[] args) {
        String S1 = "Hello";
        String S2 = new String("Hi Everyone");
        String S3 = S2.intern();

        System.out.println(S1 == S2); // false
        System.out.println(S2 == S3); // false
        System.out.println(S3 == "Hi Everyone"); // true
    }
}

/*
🧠 Step-by-Step Memory Behavior
Step	What Happens	Stack	Heap	String Pool
1	String S1 = "Hello";	S1 → ref to "Hello"	—	"Hello" created in pool
2	String S2 = new String("Hi Everyone");	S2 → ref to heap copy	"Hi Everyone" (heap)	"Hi Everyone" (pool literal created due to "Hi Everyone" inside new)
3	String S3 = S2.intern();	S3 → ref to pooled "Hi Everyone"	—	"Hi Everyone" (same pooled object reused)
🖼️ Side-by-Side Diagram
                ┌──────────────────────────────┐
Stack Memory →  │ S1 ─────────────┐            │
                │ S2 ─────┐       │            │
                │ S3 ─────────────┘            │
                └──────────────────────────────┘
                       │        │
                       │        │
                       ▼        ▼
                ┌───────────┐   ┌──────────────────┐
Heap Memory →   │ "Hi Everyone"│ (Heap copy)       │
                └───────────┘   └──────────────────┘
                       │
                       ▼
                ┌────────────────────────────────┐
String Pool →   │ "Hello"                        │
                │ "Hi Everyone"                  │
                └────────────────────────────────┘

🖨️ Output
false
false
true

💡 Key Takeaways

"Hello" and "Hi Everyone" literals always go into the String Pool.

new String("Hi Everyone") forces creation of a separate heap object.

intern() returns the reference of the pooled object.

So:

S1 == S2 → ❌ (pool vs heap)

S2 == S3 → ❌ (heap vs pool)

S3 == "Hi Everyone" → ✅ (both from pool)
 */
