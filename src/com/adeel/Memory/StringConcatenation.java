package com.adeel.Memory;

public class StringConcatenation {
    public static void main(String[] args) {
        String a = "Hello";
        String b = a + " World";
        String c = b.intern();
        String d = "Adeel" + "Iqbal";

    }
}

/*
1) After class loading (literals interned)
Heap (String Pool area)
--------------------------------
"Hello"
" World"
"Adeel"
"Iqbal"
"AdeelIqbal"   // compile-time concatenation result

2) After String a = "Hello";
Stack:        Heap (pool)
------        ----------------
a  ──▶       "Hello"  (pooled)

3) After String b = a + " World"; (runtime concat)

" World" is pooled, but the concatenation result is created at runtime with StringBuilder → new heap String "Hello World" (non-pooled).

Stack:               Heap:
------               -----------------------------------------
a  ──▶ (pooled) "Hello"   String Pool: "Hello", " World", "Adeel", ...
b  ──▶ (heap)   "Hello World"   <-- new non-pooled String object

4) After String c = b.intern();

intern() checks pool; if "Hello World" not present, JVM adds pooled "Hello World" and returns that reference.

c → pooled "Hello World". b still points to the original non-pooled heap object.

Stack:               Heap:
------               -----------------------------------------
a  ──▶ (pooled) "Hello"      String Pool: "Hello", " World", "Adeel", "Iqbal",
b  ──▶ (heap)   "Hello World"            "Hello World"  <-- added by intern()
c  ──▶ (pooled) "Hello World"
d  ──▶ (pooled) "AdeelIqbal"

5) After String d = "Adeel" + "Iqbal";

Both literals → compile-time concat → "AdeelIqbal" put directly into the pool. d points to pooled "AdeelIqbal".

Quick equality facts
a == "Hello"           // true (same pooled object)
b == c                 // false (b is non-pooled heap object; c is pooled object)
b.equals(c)            // true  (same characters)
c == "Hello World"     // true  (after intern, pool contains "Hello World")
d == "AdeelIqbal"      // true  (compile-time pooled)

 */