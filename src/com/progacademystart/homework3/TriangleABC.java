package com.progacademystart.homework3;
import java.util.Scanner;

public class TriangleABC {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координату Х");
        double x = scanner.nextDouble();
        System.out.println("Введите координату Y");
        double y = scanner.nextDouble();

        double ax = 0;
        double ay = 0;
        double bx = 4;
        double by = 4;
        double cx = 6;
        double cy = 1;


        double a = (ax - x) * (by - ay) - (bx - ax) * (ay - y);
        double b = (bx - x) * (cy - by) - (cx - bx) * (by - y);
        double c = (cx - x) * (ay - cy) - (ax - cx) * (cy - y);

        if (a > 0 && b > 0 && c > 0 || a < 0 && b < 0 && c < 0){
            System.out.println("Координата находится внутри треугольника");
        }
        else if ( a == 0 || b == 0 || c == 0){
            System.out.println("Координата находится на стороне треугольника");
        }
        else {
            System.out.println("Координата находится вне треугольника");
        }
    }
}
