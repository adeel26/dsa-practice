package com.adeel.basic.Stings;

public class PreetyPrinting {
    public static void main(String[] args) {
        float a = 453.15425f;
        System.out.printf("Formatted number is %.2f\n", a);

        System.out.printf("Pie: %.3f\n", Math.PI);

        System.out.printf("Hi, my name is %s and I am %s", "Adeel", "SE");
    }
}

/*
🔢 Numeric Specifiers

%d → prints an integer (decimal)
Example: System.out.printf("%d", 25); → output: 25

%f → prints a floating-point number
Example: System.out.printf("%.2f", 3.14159); → output: 3.14

%e or %E → prints number in scientific notation
Example: System.out.printf("%e", 1234.56); → output: 1.234560e+03

%g or %G → general format (uses %f or %e automatically)
Example: System.out.printf("%g", 123.456); → output: 123.456

%o → prints integer in octal
Example: System.out.printf("%o", 8); → output: 10

%x or %X → prints integer in hexadecimal
Example: System.out.printf("%x", 255); → output: ff

%n → prints a new line (platform-independent)
Example: System.out.printf("Hi%nBye");

🧍 Character and String Specifiers

%c → prints a single character
Example: System.out.printf("%c", 'A'); → output: A

%s → prints a string
Example: System.out.printf("%s", "Hello"); → output: Hello

%S → prints string in uppercase
Example: System.out.printf("%S", "hello"); → output: HELLO

⚙️ Formatting Modifiers

These go between % and the letter.

%-10s → left-align string in a 10-character space
Example: "%-10s" → "Hi "

%10s → right-align string in a 10-character space
Example: "%10s" → " Hi"

%05d → zero-pad integer up to 5 digits
Example: " %05d" with value 42 → "00042"

%.2f → set 2 digits after decimal
Example: "%.2f" with value 3.14159 → 3.14

%+d → always show sign (+ or −)
Example: "%+d" with value 5 → +5

%,d → use comma for grouping
Example: "%,d" with value 1000000 → 1,000,000

🧩 Boolean and Object Specifiers

%b → prints boolean (true or false)
Example: System.out.printf("%b", 5 > 3); → true

%B → same but uppercase (TRUE or FALSE)

%h or %H → prints object hash code in hex
Example: System.out.printf("%h", obj);

%n → new line (OS-independent)
 */