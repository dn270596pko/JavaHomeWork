package com.progacademystart.homework3;
import java.util.Scanner;

public class MaxInt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.println("Введите третье число: ");
        int c = scanner.nextInt();
        System.out.println("Введите четвертое число: ");
        int d = scanner.nextInt();

        int maxNumber = a;

        if (b > maxNumber) {
            maxNumber = b;
        }
        if (c > maxNumber) {
            maxNumber = c;
        }
        if (d > maxNumber) {
            maxNumber = d;
        }

        System.out.println("Максимальное число: " + maxNumber);
    }
}
