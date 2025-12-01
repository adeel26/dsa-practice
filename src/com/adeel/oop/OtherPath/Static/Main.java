package com.adeel.oop.OtherPath.Static;

public class Main {
    public static void main(String[] args) {
        // static = Makes a variable or method belong to class
        //          rather than to any specific object
        //          Commonly used for utility methods or shared resources.

        Friend friend1 = new Friend("John");
        Friend friend2 = new Friend("Cena");

        System.out.println(friend1.name);
        System.out.println(Friend.numOfFriends);

        // Calling static method
        Friend.showFriends();
    }
}
