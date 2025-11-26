package com.adeel.oop.OtherPath;

public class StaticFriendMain {
    public static void main(String[] args) {
        // static = Makes a variable or method belong to class
        //          rather than to any specific object
        //          Commonly used for utility methods or shared resources.

        StaticFriend friend1 = new StaticFriend("John");
        StaticFriend friend2 = new StaticFriend("Cena");

        System.out.println(friend1.name);
        System.out.println(StaticFriend.numOfFriends);

        // Calling static method
        StaticFriend.showFriends();
    }
}
