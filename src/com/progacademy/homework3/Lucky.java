package com.progacademy.homework3;
import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите четырехзначное целое число: ");
        int n = scanner.nextInt();

        int a = n / 1000;
        int b = n % 1000 / 100;
        int c = n % 100 / 10;
        int d = n % 10;

        if (a + b == c + d){
            System.out.println("Веденное число счастливое. =) Так как " + a + " + " + b + " = " + c + " + " + d);
        }
        else {
            System.out.println("Веденное число не очень счастливое. =( Так как " + a + " + " + b + " != " + c + " + " + d);
        }

    }
}
