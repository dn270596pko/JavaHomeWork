package com.progacademy.homework6;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ширину прямоугольника: ");
        int width = scanner.nextInt();
        System.out.println("Введите высоту прямоугольника: ");
        int height = scanner.nextInt();

        drawRectangle(width, height);
    }

    public static void drawRectangle(int width, int height) {

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (i == 1 || i == height || j == 1 || j == width) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
