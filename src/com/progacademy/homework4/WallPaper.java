package com.progacademy.homework4;
import java.util.Scanner;

public class WallPaper {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество полос: ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++ ) {
            System.out.println("***+++***+++***+++***");
        }
    }
}
