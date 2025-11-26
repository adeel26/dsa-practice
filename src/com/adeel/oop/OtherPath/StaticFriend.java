package com.adeel.oop.OtherPath;

public class StaticFriend {
    String name;
    static int numOfFriends;

    // Constructor
    StaticFriend(String name) {
        this.name = name;
        numOfFriends++;
    }

    // Static Method
    static void showFriends() {
        System.out.println("You have " + numOfFriends + " total friends");
        // using static variable in methods, we don't need this keyword
    }
}

/*
What static does here
static int numOfFriends;
This means  belongs to the class itself, not to any individual object.
• 	Every StaticFriend object has its own name.
• 	But all objects share the same numOfFriends variable.

 Why use static here?
- To keep a global count of how many StaticFriend objects have been created.
- Without static, each object would have its own numOfFriends, and you couldn’t track the total number of friends across all instances.

***
When accessing them, it's better to access them via class name instead of object name


 Why Class Name for Static?
- Clarity: It makes it obvious that the member belongs to the class itself, not any particular object.
- Best Practice: Even though Java allows you to call static members through an object reference, it’s considered bad style because it confuses readers.


Mental Model
Think of static members as belonging to the blueprint (the class), not the house (the object).
- If you want to know how many houses exist → ask the blueprint (ClassName).
- If you want to know the color of a specific house → ask the house (objectName).

👉 So yes, when accessing static members, it’s better to use the class name instead of the object name.
Would you like me to also show you constructor chaining in the same way (class vs object), since that’s another area you’ve been curious about?

 */