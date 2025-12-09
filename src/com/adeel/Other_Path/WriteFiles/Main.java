package com.adeel.Other_Path.WriteFiles;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // How to write a file using Java (4 Main options)

        // FileWriter = Good for small or medium-sized text files
        // BufferedWriter = Better performance for large amounts of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g., images, audio files)


        // File stores in main source folder
        try(FileWriter writer = new FileWriter("test.txt")){
            writer.write("I like pizza!");
            System.out.println("File has been written");
        } catch (IOException e) {
            System.out.println("Could not write file");
        }


        // File stores in main destination source folder
        // Add double slash because java takes one slash as escape sequence
        try(FileWriter writer = new FileWriter("C:\\Users\\iqbal\\Desktop\\test.txt")){
            writer.write("I like pizza!\nIts's really good!");
            System.out.println("File has been written");
        } catch (FileNotFoundException e) {
            System.out.println("Could not locate file location");
        } catch (IOException e) {
            System.out.println("Could not write file");
        }


        // Better way
        String filePath = "C:\\Users\\iqbal\\Desktop\\test.txt";
        String textContent = "I like pizza!\nIts's really good!";

        // If we have multiple lines text, we can add them using triple quotes like,
        /*
            String textContent = """
                                 Roses are red
                                 Violets are Blue
                                 ROCKING EVERYWHERE!
                                 """;
         */

        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent);
            System.out.println("File has been written");
        } catch (FileNotFoundException e) {
            System.out.println("Could not locate file location");
        } catch (IOException e) {
            System.out.println("Could not write file");
        }


    }
}
