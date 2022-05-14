package com.progacademystart.homework3;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите шестизначное целое число: ");
        int n = scanner.nextInt();

        int a = n / 100000;
        int b = n % 100000 / 10000;
        int c = n % 10000 / 1000;
        int d = n % 1000 / 100;
        int e = n % 100 / 10;
        int f = n % 10;

        if (a == f && b == e && c == d) {
            System.out.println("Введенное число явлеяется палиндромом");
        }
        else {
            System.out.println("Введенное число не явлеяется палиндромом");
        }
    }
}
