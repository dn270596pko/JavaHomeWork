package com.progacademy.lectures;

import java.util.Scanner;

public class Lecture4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input h ");
        int h = scanner.nextInt();

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h; j++) {
                if (j <= h - i) {
                    System.out.print("   ");
                } else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
