package com.progacademy.homework4;

import java.util.Scanner;

public class Hourglass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ширину песочных часов. Число должно быть нечетное:  ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j >= i && j <= n - i + 1 || j <= i && j >= n - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}