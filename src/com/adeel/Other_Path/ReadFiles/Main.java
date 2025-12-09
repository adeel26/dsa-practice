package com.adeel.Other_Path.ReadFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // How to read a file using Java (3 Main options)

        // BufferedReader + FileReader: Best for reading text files line-by-line
        // FileInputStream: Best for binary files (e.g. images, audio files)
        // RandomAccessFile: Best for read/write specific portions of large file

        String filePath = "C:\\Users\\iqbal\\Desktop\\Test_1.txt";


        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null ) {
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Could not locate file");
        }
        catch (IOException e) {
            System.out.println("Something went wrong");
        }


    }
}
