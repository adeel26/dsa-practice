package com.adeel.basic.function;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();
        String welcomeMsg = greet(name);
        System.out.println(welcomeMsg);
    }
    public static String greet(String InputName){
        String Msg = "Hello " + InputName + ", Welcome!";
        return Msg;
    }
}

/*
💡 Code Recap
String name = input.nextLine();   // "Adeel"
String welcomeMsg = greet(name);

🧩 Step 1 – Before user input
       ┌─────────────── Stack ────────────────┐
main() │ input ─────────────┐                 │
       └────────────────────│─────────────────┘
                            ▼
                        ┌───────────────┐
                        │ Scanner Obj   │   ← in HEAP
                        │ id: @101      │
                        └───────────────┘


🧠 Also, at this point:

STRING POOL:  ["Enter your name:", "Hello ", ", Welcome!"]

🧩 Step 2 – After user enters "Adeel"
       ┌─────────────── Stack ────────────────┐
main() │ input ───► Scanner@101               │
       │ name  ───► "Adeel" (pool)            │
       │ welcomeMsg ─ (not yet)               │
       └──────────────────────────────────────┘

       ┌─────────────── HEAP ────────────────┐
       │ Scanner@101 (object data)          │
       └────────────────────────────────────┘

       ┌──────────── STRING POOL ────────────┐
       │ "Enter your name:"                  │
       │ "Hello "                            │
       │ ", Welcome!"                        │
       │ "Adeel"                             │
       └────────────────────────────────────┘

🧩 Step 3 – When calling greet(name)

A new stack frame is created for greet().

       ┌─────────────── Stack ────────────────┐
main() │ input ───► Scanner@101               │
       │ name  ───► "Adeel"(pool)             │
       │ welcomeMsg ─ (waiting for return)    │
       │--------------------------------------│
greet()│ InputName ─► "Adeel"(same pool ref)  │
       │ Msg ─ (to be created)                │
       └──────────────────────────────────────┘

STRING POOL (same)
       ["Enter your name:", "Hello ", ", Welcome!", "Adeel"]

🧩 Step 4 – Inside greet()

The line:

String Msg = "Hello " + InputName + ", Welcome!";


creates a new String in the heap
(because "+" concatenation builds a new String object).

HEAP:
   ┌─────────────────────────────┐
   │ "Hello Adeel, Welcome!" @222│  ← NEW String (not in pool)
   └─────────────────────────────┘


Stack now:

greet()│ InputName ─► "Adeel"(pool)
       │ Msg ───► "Hello Adeel, Welcome!"@222

🧩 Step 5 – Return from greet()

When greet() finishes, it returns reference of @222 to main().
The greet() frame is destroyed, but the string object stays in heap.

       ┌────────────── Stack ───────────────┐
main() │ input ─► Scanner@101               │
       │ name ─► "Adeel"(pool)              │
       │ welcomeMsg ─► "Hello Adeel, Welcome!"@222
       └────────────────────────────────────┘

       ┌────────────── Heap ───────────────┐
       │ Scanner@101                       │
       │ "Hello Adeel, Welcome!" @222      │
       └───────────────────────────────────┘

       ┌──────────── String Pool ──────────┐
       │ "Enter your name:"                │
       │ "Hello "                          │
       │ ", Welcome!"                      │
       │ "Adeel"                           │
       └───────────────────────────────────┘

🧠 Final Output
System.out.println(welcomeMsg);
→ Hello Adeel, Welcome!

✅ Key Points to Remember
Concept	Explanation
Stack	Temporary memory for methods & variables
Heap	Holds actual objects (Scanner, new Strings)
String Pool	Special area inside heap storing string literals only
Concatenation	Creates new String in heap (not pool)
Passing parameter	Only the reference is copied, not the string itself
 */


/*
🧠 Question:

Why are "Hello " and ", Welcome!" already in the String Pool before the greet() method is called?

🔍 Explanation:

Those two are string literals, not runtime-created strings.

In Java, all string literals — meaning anything written in quotes directly in the code —
are automatically stored in the String Pool by the Class Loader when your program starts.

So even before main() begins execution,
the Java Virtual Machine (JVM) loads your class and registers all literals into the pool.
 */