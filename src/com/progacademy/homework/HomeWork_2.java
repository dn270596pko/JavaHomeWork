package com.progacademy.homework;

public class HomeWork_2 {
    public static void main(String[] args) {
        double sideA = 0.3;
        double sideB = 0.4;
        double sideC = 0.5;

        double semiPerimeter = (sideA + sideB + sideC) / 2;
        double answer = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));

        System.out.println(answer);
    }
}
