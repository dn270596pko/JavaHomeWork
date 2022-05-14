package com.progacademystart.lectures;
import java.util.Scanner;

public class Lecture3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стимость первого товара: ");
        int a = scanner.nextInt();
        System.out.println("Введите стимость второго товара: ");
        int b = scanner.nextInt();
        System.out.println("Введите стимость третьего товара: ");
        int c = scanner.nextInt();

        int maxPrice = a;

        if (b > maxPrice) {
            maxPrice = b;
        }
        if (c > maxPrice) {
            maxPrice = c;
        }
            System.out.println("Стоимость самого дорогого товара в чеке: " + maxPrice + " ГРН");
    }
}