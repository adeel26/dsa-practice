package com.adeel.Other_Path.HashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // HashMap = A data structure that store key-value pairs
        //           Keys are unique, but Values can be duplicated
        //           Does not maintain any order, but is memory efficient
        //           HashMap<Key, Value>

        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 0.14);
        map.put("Banana", 0.17);
        map.put("grapes", 0.21);
        map.put("coconut", 2.23);
        map.put("tomato", 0.04);

        System.out.println(map);

        map.remove("coconut");
        System.out.println(map);

        System.out.println(map.get("apple"));
        System.out.println(map.containsKey("Banana"));
        System.out.println(map.containsValue(0.17));

        if(map.containsKey("apple")) {
            System.out.println("apple found and its value is: " + map.get("apple"));
        }else {
            System.out.println("Key not found");
        }

        System.out.println("Size of map is: " + map.size());

        System.out.println(map.keySet());
        System.out.println(map.values());

        for(String key : map.keySet()) {
            System.out.println(key + " : $" + map.get(key));
        }



    }
}
