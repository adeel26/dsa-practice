package com.adeel.Other_Path.Generics;

public class Main {
    public static void main(String[] args) {

        // Generics = A concept where you can write a class, interface, or method
        //            that is compatible with different data types.
        //            <T> type parameter (placeholder that gets replaced with a real type)
        //            <String> type argument (specifies the type)

        Box<String> box1 = new Box<>();
        box1.setItem("Apple");
        System.out.println(box1.getItem());

        Box<Integer> box2 = new Box<>();
        box2.setItem(512);
        System.out.println(box2.getItem());

        Box<Double> box3 = new Box<>();
        box3.setItem(512.05);
        System.out.println(box3.getItem());


        Product<String, Integer> product1 = new Product<>("Iphone", 800);
        product1.price = 2000;
        System.out.println(product1.price);
        System.out.println(product1.getPrice());

        Product<Character, Double> product2 = new Product<>('Z', 51.5);
        product2.setItem('A');
        System.out.println(product2.item);
        System.out.println(product2.getItem());


        
    }
}
