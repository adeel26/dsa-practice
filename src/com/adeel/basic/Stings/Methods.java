package com.adeel.basic.Stings;

public class Methods {
    public static void main(String[] args) {
        String s = "Hello World";

        // 1. Basic Info Methods
        s.length();           // → 11
        s.isEmpty();          // → false
        s.charAt(1);          // → 'e'
        s.indexOf('o');       // → 4
        s.lastIndexOf('o');   // → 7

        // 2. Comparison
        s.equals("Hello World");     // → true
        s.equalsIgnoreCase("hello world"); // → true
        s.compareTo("Hello");        // → positive (lexicographic diff)
        s.startsWith("He");          // → true

        // 3. Substring + Parts
        s.substring(0, 5);    // → "Hello"
        s.substring(6);       // → "World"

        // 4. Modification (returns new strings — immutable!)
        s.toLowerCase();      // → "hello world"
        s.toUpperCase();      // → "HELLO WORLD"
        s.trim();             // removes leading/trailing spaces
        s.replace('o', '0');  // → "Hell0 W0rld"
        s.replace("World", "Java"); // → "Hello Java"
        s.concat("!!!");      // → "Hello World!!!"

        // 5. Split & Join
        String[] parts = s.split(" ");   // → ["Hello", "World"]
        String joined = String.join("-", parts); // → "Hello-World"

        // 6. Checking Content
        s.contains("World");   // → true
        s.matches(".*World.*"); // → true (regex)

        // 7. Conversion
        String.valueOf(123);        // → "123"
        String.valueOf(true);       // → "true"
        char[] chars = s.toCharArray();  // → ['H','e','l','l','o',' ',...]

        // 8. Formatting
        String formatted = String.format("Name: %s, Age: %d", "John", 35);
        // → "Name: Adeel, Age: 35"

        // 9. Joining multiple
        String joined2 = String.join(", ", "One", "Two", "Three");
        // → "One, Two, Three"

        // 10. Example Summary Code
        System.out.println(s.trim().toUpperCase().replace("WORLD", "JAVA"));
        // → "HELLO JAVA"

    }
}
