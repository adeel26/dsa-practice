package com.adeel.Questions.Strings;
// Sorting the Sentence
public class Q_Strings5 {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";

        sortSentence(s);
    }

    static String sortSentence(String s) {
        String output = "";
        System.out.println(s.substring(0, 1));
        System.out.println(s.substring(0, 2));
        System.out.println(s.substring(0, 3));
        System.out.println(s.substring(2, 2));

        return output;
    }
}
