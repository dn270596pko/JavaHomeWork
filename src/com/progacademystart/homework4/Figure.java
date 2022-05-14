package com.progacademystart.homework4;

import java.util.Scanner;

public class Figure {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту фигуры: ");
        int height = scanner.nextInt();
        String str = "";

        for (int i = -height + 1; i < height + 1; i++) {
            if (i <= 0) {
                str += "* ";
                System.out.println(str);
            } else {
                String sub = str.substring(0, height * 2 - 2 * i);
                System.out.println(sub);
            }
        }
    }
}
