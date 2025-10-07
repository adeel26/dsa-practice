package com.adeel.Memory;

public class MutableString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Everyone");
        System.out.println(sb);
    }
}

/*
⚙️ Step-by-Step Memory Flow
1️⃣ Class loading (before main runs)
Area	What’s inside
String Pool	"Hello", " World" (literals found in code)
Heap	Empty right now
Stack	Empty (main not started yet)
2️⃣ main() starts
Stack (main)	Heap	String Pool
sb → ?	—	"Hello", " World"

Now executes:

StringBuilder sb = new StringBuilder("Hello");


🔹 "Hello" literal fetched from String Pool
🔹 new StringBuilder("Hello") creates a new mutable object in heap

So now:

Stack	Heap	String Pool
sb ────▶ StringBuilder@100 (content="Hello")	StringBuilder object with internal char[] = {'H','e','l','l','o'}	"Hello", " World"
3️⃣ Then executes:
sb.append(" World");


" World" is taken from the String Pool.

The append() method modifies the same heap object (not create a new one).

Stack	Heap	String Pool
sb ────▶ StringBuilder@100 (content="Hello World")	Same StringBuilder object, but its internal char[] updated → {'H','e','l','l','o',' ','W','o','r','l','d'}	"Hello", " World"

💡 No new object created, just changed the existing one in the heap.
That’s why StringBuilder (and StringBuffer) are mutable.

4️⃣ Output
System.out.println(sb);


→ prints ✅ Hello World


🔍 Visualization
[Stack]                  [Heap]                     [String Pool]
sb ───────────────▶  StringBuilder@100             "Hello"
                     content = "Hello World"       " World"

 */