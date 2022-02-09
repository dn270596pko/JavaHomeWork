package com.progacademy.homework3;
import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Веддите год: ");
        int n = scanner.nextInt();

        if (n % 100 == 0 && n % 400 == 0 ) {
            System.out.println("Год является високосным. Количество дней в году: 366");
        }

        else if (n % 4 == 0 && n % 100 > 0) {
            System.out.println("Год является високосным. Количество дней в году: 366");
        }

        else if (n % 100 == 0) {
            System.out.println("Год НЕ является високосным. Количество дней в году: 365");
        }

        else {
            System.out.println("Год НЕ является високосным. Количество дней в году: 365");
        }
    }
}
