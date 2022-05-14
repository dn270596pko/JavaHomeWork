package com.progacademystart.lectures;
import java.util.Scanner;

public class Lecture1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите стоимость кофе:");
        int coffeeCost = scanner.nextInt();
        System.out.println("Ведите количество чашек кофе:");
        int cups = scanner.nextInt();
        int total = coffeeCost * cups;

        System.out.println("С вас: " + total + " ГРН");
    }
}
