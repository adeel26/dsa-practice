package com.adeel.basic.Stings;

// StringBuilder
public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder(); // Create new stringbuilder obj in heap which is mutable
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i); // typeCasting in char, like 97+1 = 98 will be 'b'
            builder.append(ch);
        }

        System.out.println(builder.toString()); // Will create separate heap object
    }
}

/*
🔹 What is StringBuilder?
StringBuilder is a mutable (changeable) sequence of characters —
unlike String, which is immutable.

So when you modify a StringBuilder,
it changes the existing object in memory (doesn’t create a new one every time).

🔹 Why it exists
Every time you modify a String, Java creates a new String object in the heap:

String s = "Hello";
s = s + " World";  // creates new object

That’s inefficient if you’re doing many concatenations (like in loops).
So Java gives StringBuilder for faster string manipulation.

🔹 Basic example
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
sb.append("!");
System.out.println(sb.toString());


✅ Output: Hello World!
Here, sb stays the same object — only its internal character buffer changes.


🔹 Example — difference in speed
String s = "";
for (int i = 0; i < 10000; i++) {
    s = s + i; // new String object created each time
}

StringBuilder sb = new StringBuilder();
for (int i = 0; i < 10000; i++) {
    sb.append(i); // modifies same object
}

✅ StringBuilder version runs much faster and uses less memory.

🔹 Memory behavior
String → immutable → new object created every modification.
StringBuilder → mutable → one object, modified in place in the heap.

------------------------------------------------------------------------------

Common Methods

append() – adds text at the end
➡️ sb.append("abc"); → if sb = "Hi", now it becomes "Hiabc"

insert(index, str) – inserts text at a specific position
➡️ sb.insert(2, "XYZ"); → if sb = "HiAll", now it becomes "HiXYZAll"

delete(start, end) – removes characters from start to (end-1)
➡️ sb.delete(0, 2); → if sb = "Hello", now it becomes "llo"

reverse() – reverses all characters
➡️ sb.reverse(); → if sb = "ABC", now it becomes "CBA"

toString() – converts StringBuilder back to a normal String
➡️ sb.toString();

length() – gives the current number of characters
➡️ sb.length(); → returns an int

setCharAt(index, ch) – replaces a character at a specific position
➡️ sb.setCharAt(1, 'e'); → if sb = "Hollo", now it becomes "Hello"
 */

// ----------------------------------------------------------------------------

/*
Key difference between implicit concatenation (using +) and explicit use of StringBuilder. Let’s unpack this carefully 👇

🔹 Case 1: Normal concatenation using +
String s = "Hello";
s = s + " World";

✅ What happens behind the scenes:
Java creates a new StringBuilder temporarily.
It appends "Hello" and " World".
Then it calls .toString() to produce a new String object in the heap.
The temporary StringBuilder is discarded right after that.
So, every time you do:
s = s + "!";
…it internally creates a new StringBuilder + new String object, which is inefficient in loops.

🔹 Case 2: Using your own StringBuilder
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");

✅ Here:
The same StringBuilder object is reused.
.append() just modifies its internal buffer (no new String each time).
Only when you finally call sb.toString(), a single new String is created.

So it’s efficient because you’re not repeatedly creating new StringBuilder objects and not creating new Strings on every append.

✅ Conclusion:
StringBuilder only works efficiently when you explicitly create and reuse it.
When Java uses it behind the scenes (like with +), it creates a new one every time — that’s why it’s not efficient in loops.
 */

//-------------------------------------------------------

/*

🔹 What a StringBuilder actually is
A StringBuilder is not a String.
It’s a mutable container (buffer) that holds characters in an internal array and lets you modify them (append, delete, insert, etc.) without creating new objects.

Example:
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");

Right now, sb is an object like this (conceptually):

StringBuilder {
   value = ['H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd']
}

It’s not a String, just a modifiable sequence of characters sitting in a char array inside the object.

🔹 Why you need .toString()
The toString() method creates an immutable String object (the regular Java String type) from that internal buffer.
So:
String s = sb.toString();

creates this:
String "Hello World"

Now s is a real String, immutable and ready for normal string operations.

🔹 Analogy
Think of StringBuilder like a whiteboard 🧑‍🏫 — you can write, erase, and modify text freely.
A String is like a printed page 📰 — once printed, you can’t change it.
.toString() is the act of printing what’s currently on your whiteboard onto paper.

You call .toString() only when you’re done building and want the final immutable result.
 */

//-------------------------------------------------------

/*
String s1 = new String("Hello");
s1.concat(" World");
System.out.println(s1);

🔹 Step 1:
String s1 = new String("Hello");
"Hello" (literal) goes into the String Pool.
new String("Hello") creates a new object in the heap, a copy of that literal.
So there are two “Hello” strings:
One in the pool.
One new object in the heap (that s1 points to).

🔹 Step 2:
s1.concat(" World");
The concat() method does not modify the original string (because String is immutable).
It creates a new String object in the heap with the value "Hello World".
But you didn’t assign that new object anywhere, so it’s lost (eligible for garbage collection).

🔹 Step 3:
System.out.println(s1);
s1 still points to the original "Hello" object in the heap.
So it prints:
Hello

✅ Final Output:
Hello

If you instead wrote:

s1 = s1.concat(" World");
System.out.println(s1);
Then it would print:

Hello World
because now s1 is updated to point to the new object returned by concat().
 */