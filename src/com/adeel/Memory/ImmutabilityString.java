package com.adeel.Memory;

public class ImmutabilityString {
    public static void main(String[] args) {
        String s1 = "Hello";            // from string pool
        String s2 = new String("Hello");  // new object in heap

        s1.concat(" World");
        s2.concat(" Everyone");

        System.out.println(s1); // "Hello"
        System.out.println(s2); // "Hello"

        // Both stay the same — concat() created new strings, but didn’t modify the originals.
    }
}

/*
new String("Hello") is still immutable.

Even though you used new, it does not make the string mutable.

🧠 Why?

Because immutability is a property of the String class itself,
not how you create it.

String objects — whether from the pool or created with new —
cannot be changed after creation.

🧠 Analogy
Think of:
String = printed text on paper 🧾 (can’t erase or change)
StringBuilder = whiteboard 🧑‍🏫 (you can add, erase, modify freely)

So whether you “print” a new paper (new String) or reuse an existing one (from pool),
once it’s printed — you can’t change it.

✅ Final rule to remember:
“All Strings in Java are immutable — regardless of where or how they are created.”
 */