package com.adeel.Memory;

public class JVMliteralsLoad {
    public static void main(String[] args) {
        int a = 10;
        String c = "abc";
    }
}

/*
🧠 When JVM loads your class

Before main() starts, the class loader scans your .class file.
It finds all constant literals (like numbers, characters, strings, etc.) used directly in your code.

It then:

-> puts string literals (like "abc", "Hello") into the String Pool,
-> stores numeric literals (like 10, 3.14, etc.) in a class-level constant table (not heap, not pool — they’re part of the class metadata and loaded directly into stack when needed).



 */