package com.adeel.Questions.Strings;
// Check If Two String Arrays are Equivalent
public class Q_Strings6 {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        System.out.println(arrayStringsAreEqual(word1, word2));
    }
    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        String sentence1 = String.join("", word1);
        String sentence2 = String.join("", word2);

        System.out.println(sentence1);
        System.out.println(sentence2);

        if(sentence1.equals(sentence2)){
            return true;
        }else
        {
            return false;
        }

    }
}
