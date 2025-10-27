package com.adeel.basic.Stings;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i); // typeCasting in char, like 97+1 = 98 will be 'b'
            series = series + ch + " ";
            // This is actually creating new string on every loop like
            // a ab abc abcd abcde abcdef so on
            // Also when char is added to string it will convert to string
        }

        System.out.println(series);
    }
}
