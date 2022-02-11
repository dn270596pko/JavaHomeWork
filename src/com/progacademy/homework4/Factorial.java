package com.progacademy.homework4;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число n (4 < n < 16)");
        int n = scanner.nextInt();
        long result = 1;
        int i = 1;

        while (i < n){
            result = result * n;
            n--;
        }
        System.out.println("Факториал введенного числа = " + result);
    }
}
