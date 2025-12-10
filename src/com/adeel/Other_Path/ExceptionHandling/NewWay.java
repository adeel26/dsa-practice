package com.adeel.Other_Path.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NewWay {
    public static void main(String[] args) {

        // try-with-resources is a feature that automatically closes resources when you’re done using them.

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            System.out.println(number);
        } catch (InputMismatchException e) {
            System.out.println("That wasn't a number");
        } catch (ArithmeticException e) {
            System.out.println("YOU CAN'T DIVIDE BY ZERO!");
        } catch (Exception e) {
            // SAFETY NET
            System.out.println("Something went wrong");
        } finally {
            System.out.println("This always executes");
        }
    }
}

/*

✅ try-with-resources in Java (clear + practical)
try-with-resources is a Java feature that automatically closes resources when you’re done using them.

🔹 What is a “resource”?
Any object that implements AutoCloseable (or Closeable):

Examples:
Scanner
FileInputStream
BufferedReader
Connection
PreparedStatement
ResultSet

🔹 Why we need it (problem first)
❌ Old way
Scanner sc = null;

try {
    sc = new Scanner(new File("data.txt"));
    System.out.println(sc.nextLine());
} catch (Exception e) {
    e.printStackTrace();
} finally {
    if (sc != null) {
        sc.close();  // easy to forget, messy
    }
}


Problems:

Forget to close → resource leak
More code
Error-prone

✅ Try-with-resources (clean way)
try (Scanner sc = new Scanner(new File("data.txt"))) {
    System.out.println(sc.nextLine());
}


✅ close() is called automatically
✅ Even if exception occurs
✅ Cleaner & safer

🔹 How it works internally
try (Resource r = ...) {
    // use r
}

is roughly equivalent to:

Resource r = ...;
try {
    // use r
} finally {
    r.close();
}

🔹 Multiple resources
try (
    Scanner sc = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new FileReader("data.txt"))
) {
    // use both
}


Closed in reverse order
Safe & predictable

🔹 Custom class with try-with-resources

If YOU want your class to work with it:

class MyResource implements AutoCloseable {
    public void close() {
        System.out.println("Closed!");
    }
}


Usage:

try (MyResource r = new MyResource()) {
    System.out.println("Using resource");
}


Output:

Using resource
Closed!

🔹 Why some objects are NOT in try-with-resources?

Because:
They don’t need closing
Or closing them too early is dangerous

Example:
Clip clip = AudioSystem.getClip(); // NOT in try(...)

Reason:
Audio should keep playing

You control when to stop/close it

🔹 Common mistakes ❌
❌ Not AutoCloseable
try (String s = "hello") { } // ❌

❌ Using resource after try
Scanner sc;
try (sc = new Scanner(System.in)) {
    // use
}
sc.next(); // ❌ closed

🔹 When should YOU use it?

✅ Files
✅ Streams
✅ DB connections
✅ Network sockets

❌ GUI objects
❌ Long-living system resources
❌ Objects whose lifecycle you control manually

✅ One-line takeaway

try-with-resources guarantees automatic, safe cleanup of resources that must be closed.
 */