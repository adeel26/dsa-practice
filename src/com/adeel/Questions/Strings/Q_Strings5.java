package com.adeel.Questions.Strings;

import java.util.Arrays;

// Sorting the Sentence
public class Q_Strings5 {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";

        System.out.println(sortSentence(s));
    }

    static String sortSentence(String s) {
        // Split the sentence and get it in array
        String[] parts = s.split(" ");

        // Sort them according to numeric digit at end of every word
        String[] ordered = new String[parts.length];
        for (int i = 0; i < ordered.length ; i++) {
            String part = parts[i]; // get each part at i position
            char lastChar = part.charAt(part.length()-1);
            int digit = Character.getNumericValue(lastChar); // Converting char to numeric. We can also do it by minus it with 0 and it works for 0-9

            ordered[digit-1] = part; // digits are not index so we have to minus 1


        }

        String[] sentence = new String[ordered.length];
        for (int i = 0; i < ordered.length; i++) {
            // Removing last digit words in ordered array
            String word = ordered[i];
            sentence[i] = word.substring(0, word.length()-1);
        }

        System.out.println(Arrays.toString(ordered));
        System.out.println(Arrays.toString(sentence));

        String output = String.join(" ", sentence);
        return output;
    }
}
