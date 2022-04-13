package com.progacademy.lectures;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Lecture8 {
    public static void main(String[] args) throws FileNotFoundException {

        int[] array = new int[] { 4, -2, 7, 8, 19 };
        File file = new File("array.txt");

        saveArray(file, array);

    }

    public static void saveArray(File file, int[] array) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(file);
        for (int i = 0; i < array.length; i++) {
            pw.println(array[i]);
        }
    }
}