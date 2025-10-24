package com.adeel.Questions;

import java.util.Arrays;

// Check if the Sentence Is Pangram
public class Q_Array10 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
    static boolean checkIfPangram(String sent) {
        boolean[] check = new boolean[26];

        // Converting string into char array
        char[] charArray = new char[sent.length()];
        for (int i = 0; i < sent.length(); i++) {
            charArray[i] = sent.charAt(i);
        }
        System.out.println(Arrays.toString(charArray));


        // create alphabet array lowercase
        char[] alphabetLowerCase = new char[26];
        for (int i = 0; i < alphabetLowerCase.length; i++) {
            alphabetLowerCase[i] = (char) ('a' + i);
        }
        System.out.println(Arrays.toString(alphabetLowerCase));

        // Find i elements of alphabetLowerCase in chaArray[j]
        for (int i = 0; i < alphabetLowerCase.length ; i++) {
            for (int j = 0; j < charArray.length; j++) {
                if(alphabetLowerCase[i] == charArray[j]){
                    check[i] = true;
                }
            }
        }
        System.out.println(Arrays.toString(check));

        // Checking if all elements of check array is true or not
        boolean pangram = true;
        for (int i = 0; i < check.length; i++) {
            if(!check[i]){
                pangram = false;
                break;
            }
        }
        return pangram;
    }
}

/*
// create alphabet array uppercase
        char[] alphabetUpperCase = new char[26];
        for (int i = 0; i < alphabetUpperCase.length; i++) {
            alphabetUpperCase[i] = (char) ('A' + i);
        }
        System.out.println(Arrays.toString(alphabetUpperCase));
 */