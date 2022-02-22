package com.progacademy.homework6;

import java.util.Scanner;

public class Concat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String a = scanner.nextLine();
        System.out.println("Введите целое число:");
        int b = scanner.nextInt();
        System.out.println("Введите вещественное число:");
        double c = scanner.nextDouble();


        String answer = concat(a, b, c);
        System.out.println(answer);

    }

    public static String concat(String a, int b, double c) {
        String str = a + (b + c);
        return str;
    }
}
