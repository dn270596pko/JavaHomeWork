package com.progacademystart.lectures;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Lecture8 {
    public static void main(String[] args) {

        File file = new File("array.txt");

        try (PrintWriter pw = new PrintWriter(file)) {

            pw.println("Hello world");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}