package com.adeel.basic.function;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        multipleArgs(4, 55, 77, 9, 34, 2, 1);
    }

    static void multipleArgs(int ...adeel){
        System.out.println(Arrays.toString(adeel));
    }
}

// int ...adeel --> is an array of integer at backend
// String ...adeel --> is an array of String at backend

/*
In Memory

.

🧠 Memory Visualization (Step-by-Step)
🪜 Step 1: When class is loaded
┌──────────────────────────────┐
│         STRING POOL          │
├──────────────────────────────┤
│ "args"   ← from main(String[] args) │
└──────────────────────────────┘

┌──────────────────────────────┐
│        METHOD AREA           │
├──────────────────────────────┤
│ VarArgs.class (bytecode)     │
│ Arrays.class                 │
│ System.class                 │
└──────────────────────────────┘


No objects in heap yet — class is just loaded.

🪜 Step 2: main() starts
┌──────────────────────────────┐
│           STACK              │
├──────────────────────────────┤
│ main()                       │
│  ├── args → String[]@A100 (empty array) │
│  └── call → multipleArgs(4, 55, 77, 9, 34, 2, 1) │
└──────────────────────────────┘

┌──────────────────────────────┐
│            HEAP              │
├──────────────────────────────┤
│ [A100] String[] {}           │
└──────────────────────────────┘

┌──────────────────────────────┐
│         STRING POOL          │
├──────────────────────────────┤
│ "args"                       │
└──────────────────────────────┘

🪜 Step 3: multipleArgs() executes
┌──────────────────────────────┐
│           STACK              │
├──────────────────────────────┤
│ main()                       │
│                              │
│ multipleArgs()               │
│   └── adeel → int[]@B200     │
└──────────────────────────────┘

┌──────────────────────────────┐
│            HEAP              │
├──────────────────────────────┤
│ [B200] int[] {4,55,77,9,34,2,1} │
└──────────────────────────────┘

┌──────────────────────────────┐
│         STRING POOL          │
├──────────────────────────────┤
│ "args"                       │
└──────────────────────────────┘

🪜 Step 4: Arrays.toString(adeel) executes

Arrays.toString() builds a new String object (heap-only)
→ e.g. "[4, 55, 77, 9, 34, 2, 1]"

┌──────────────────────────────┐
│           STACK              │
├──────────────────────────────┤
│ main()                       │
│ multipleArgs()               │
│   └── adeel → int[]@B200     │
└──────────────────────────────┘

┌──────────────────────────────┐
│            HEAP              │
├──────────────────────────────┤
│ [B200] int[] {4,55,77,9,34,2,1} │
│ [C300] String "[4, 55, 77, 9, 34, 2, 1]" │
└──────────────────────────────┘

┌──────────────────────────────┐
│         STRING POOL          │
├──────────────────────────────┤
│ "args"                       │
└──────────────────────────────┘

✅ Final Output
[4, 55, 77, 9, 34, 2, 1]

 */