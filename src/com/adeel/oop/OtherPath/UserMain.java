package com.adeel.oop.OtherPath;

public class UserMain {
    public static void main(String[] args) {

        // overload constructors = Allow a class to have multiple constructors
        //                         with different parameter lists.
        //                         Enable objects to be initialized in various ways.

        User user1 = new User("John");
        User user2 = new User("Batista", "batista@yahoo.com");
        User user3 = new User("Shawn", "shawn@yahoo.com", 30);

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);


    }
}
