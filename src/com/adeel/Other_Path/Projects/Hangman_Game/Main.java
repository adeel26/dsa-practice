package com.adeel.Other_Path.Projects.Hangman_Game;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // JAVA HANGMAN GAME
        String filePath = "src/com/adeel/Other_Path/Projects/Hangman_Game/words.txt";
        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath)))
        {
            String line;
            while((line = reader.readLine()) != null)
            {
                words.add(line.trim());
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Could not find file");
        }
        catch (IOException e)
        {
            System.out.println("Something went wrong");
        }


        // Get random word from file
        Random random = new Random();
        // Return a random word/object between 1 and 7
        String word = words.get(random.nextInt(words.size()));


        // String word = "pizza";

        Scanner input = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        System.out.println("************************");
        System.out.println("Welcome to Java Hangman!");
        System.out.println("************************");


        while (wrongGuesses < 6)
        {
            System.out.println(getHangmanArt(wrongGuesses));
            System.out.print("Word: ");

            // *Auto-inboxing
            for (char c : wordState)
            {
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.print("Guess a letter: ");
            char guess = input.next().toLowerCase().charAt(0);


            // indexOf will return -1 if there is no matching
            if(word.indexOf(guess) >= 0)
            {
                System.out.println("Correct guess!\n");


                for (int i = 0; i < word.length(); i++)
                {
                    // Adding correct guess in our Array list on its position
                    if(word.charAt(i) == guess)
                    {
                        wordState.set(i, guess);
                    }
                }

                // check win
                if(!wordState.contains('_'))
                {
                    System.out.println(getHangmanArt(wrongGuesses));
                    System.out.println("YOU WIN");
                    System.out.println("The word was: " + word);
                    break;
                }

            }


            else
            {
                wrongGuesses++;
                System.out.println("Wrong guess\n");
            }
        }

        // Last guess and it should be out of while loop
        if(wrongGuesses >= 6)
        {
            System.out.println(getHangmanArt(wrongGuesses));
            System.out.println("GAME OVER!");
            System.out.println("The word was: " + word);
        }

        input.close();

    }

    static String getHangmanArt(int wrongGuesses)
    {

        return switch (wrongGuesses)
        {
            case 0 -> """
                    
                    
                    
                      """;
            case 1 -> """
                        0
                    
                    
                      """;
            case 2 -> """
                        0
                        |
                    
                      """;
            case 3 -> """
                        0
                       /|
                    
                      """;
            case 4 -> """
                        0
                       /|\\
                            
                      """;
            case 5 -> """
                        0
                       /|\\
                       /     
                      """;
            case 6 -> """
                        0
                       /|\\
                       / \\    
                      """;
            default -> "";
        };
    }

}

/*
✅ ArrayList of Character + primitive char loop = VALID
ArrayList<Character> letters = new ArrayList<>();
letters.add('A');
letters.add('B');
letters.add('C');

for (char c : letters) {
    System.out.println(c);
}


✅ This compiles
✅ This runs
✅ This is auto-unboxing

🔍 What’s actually happening?
ArrayList<Character> stores Character objects
char c is a primitive
Java automatically converts:
Character → char
This is called auto-unboxing

🧠 Why does Java allow this?
Java added Autoboxing / Unboxing in Java 5 to:
Reduce verbosity
Make collections easier to use
Allow primitives to “feel” like they work with objects
Without it, you would HAVE to write:

for (Character cObj : letters) {
    char c = cObj.charValue();
    System.out.println(c);
}

Auto-unboxing does this conversion for you automatically.


⚠️ Important edge case (same as Integer)
If the list contains null:

ArrayList<Character> list = new ArrayList<>();
list.add(null);

for (char c : list) {
    System.out.println(c); // ❌ NullPointerException
}

Because:
null → char   ❌ impossible


✅ Safe way:

for (Character c : list) {
    System.out.println(c);
}

✅ Final rule (very important)

Collections store WRAPPER objects
Enhanced for-loop can use PRIMITIVES via auto-unboxing

This rule applies to:
Integer → int
Double → double
Character → char
Boolean → boolean
 */