package com.adeel.oop.OtherPath.GettersAndSetters;

public class Car {
    private String model;
    private String color;
    private int price;

    // Constructor
    Car(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    // Getters
    String getModel() {
        return this.model;
    }
    String getColor() {
        return this.color;
    }
    int getPrice() {
        return this.price;
    }

    // Setters
    void setColor(String color) {
        this.color = color;
    }
    void setPrice(int price) {
        this.price = price;
    }
}

/*
In Classes
• 	If you don’t write any modifier, the method/variable has default (package-private) access.
• 	Meaning: it’s accessible only within the same package.
• 	If you want it accessible everywhere, you must explicitly write public.

In Interfaces
- All methods are implicitly public and abstract (unless marked default or static).
- You don’t need to write public — but if you omit it, the compiler will still treat it as public.
Notice: when you implement an interface, the method must be public, because the interface contract is public.


✅ Java Access Modifiers (Short & Simple)
1. public
Accessible from anywhere (same class, same package, different package, subclasses).
No restrictions.

2. protected
Accessible:
Inside same class
Inside same package
In subclasses (even in different packages)

3. default (no keyword)
Accessible only inside the same package.
Not visible outside the package.
Also called package-private.

4. private
Accessible only inside the same class.
Not visible in:
Same package
Subclasses
Outside class

------------------------------------------------------------

Final:
final is not an access modifier — it’s a non-access modifier in Java.
Here is the short and clear meaning of final:

✅ Meaning of final in Java (Very Short Explanation)
final means “cannot be changed later”.

But what it prevents from changing depends on where you use it:

1️⃣ final variable → value cannot change (constant)

final int x = 10;
x = 20;  // ❌ ERROR: cannot change

If a variable is final, you must assign value one time only.

2️⃣ final method → cannot be overridden

class A {
    final void show() { }
}

class B extends A {
    void show() { }   // ❌ ERROR: cannot override final method
}

Used when you don’t want subclasses to change the behavior.

3️⃣ final class → cannot be inherited

final class A { }

class B extends A { }  // ❌ ERROR: cannot extend final class


Examples from Java: String, Integer, Math are final classes.
 */
