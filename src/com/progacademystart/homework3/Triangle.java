package com.progacademystart.homework3;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите поочередно все стороны треугольника: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("Такой треугольник существует.");
        }
        else {
            System.out.println("Такого треуголника не существует!");
        }
    }
}
