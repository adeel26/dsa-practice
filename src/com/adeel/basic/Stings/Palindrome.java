package com.adeel.basic.Stings;

public class Palindrome {
    public static void main(String[] args) {
        String s = "abcdcba";
        System.out.println(s.length());
        System.out.println(checkPalindrome(s));
        System.out.println(isPalindrome(s));
    }

    // With for loop
    static boolean checkPalindrome(String str){
        str.toLowerCase();
        for (int i = 0; i <= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);

            if( start != end ){
                return false;
            }
        }
        return true;
    }

    // Wih while loop
    static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false; // mismatch → not palindrome
            }
            start++;
            end--;
        }
        return true; // all matched
    }
}
