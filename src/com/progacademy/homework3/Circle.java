package com.progacademy.homework3;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double radius = 4;

        if ((Math.pow(x,2) + Math.pow(y,2)) <= Math.pow(radius,2)) {
            System.out.println("Указаная точке лежит внутри круга");
        }else{
            System.out.println("Указаная точке лежит вне круга");
        }
    }
}
