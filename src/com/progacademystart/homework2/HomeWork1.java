package com.progacademystart.homework2;
import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое пятизначное число: ");
        int number = scanner.nextInt();

        int a = number / 10000;
        int b = number % 10000 / 1000;
        int c = number % 1000 / 100;
        int d = number % 100 / 10;
        int e = number % 10;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
