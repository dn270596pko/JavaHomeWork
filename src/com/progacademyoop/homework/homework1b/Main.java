package com.progacademyoop.homework.homework1b;

public class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(8.4, 8.4, 4.2);
        Triangle t2 = new Triangle(4.2, 4.2, 2.1);

        System.out.println("Площадь первого треугольника: " + t1.getArea() + "см²");
        System.out.println("Площадь второго треугольника: " + t2.getArea() + "см²");
    }
}
