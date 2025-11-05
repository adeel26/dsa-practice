package com.adeel.Questions.Strings;
// Determine if String Halves Are Alike
public class Q_Strings8 {
    public static void main(String[] args) {
        String s = "book";
        System.out.println(halvesAreAlike(s));
    }
    static boolean halvesAreAlike(String s) {

        // Split string into two equal parts
        String a = s.substring(0,s.length()/2);
        String b = s.substring(s.length()/2);

        // Check first part
        int aCount = 0;
        for (int i = 0; i < s.length()/2; i++) {
            char ch = a.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                aCount++;
            }
        }

        // Check second part
        int bCount = 0;
        for (int i = 0; i < s.length()/2; i++) {
            char ch = b.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                bCount++;
            }
        }

        return aCount == bCount;
    }
}
