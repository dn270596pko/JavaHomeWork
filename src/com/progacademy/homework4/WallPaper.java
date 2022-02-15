package com.progacademy.homework4;
import java.util.Scanner;

public class WallPaper {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество полос: ");
        int count = scanner.nextInt();

        for (int i = 0; i < 5; i++ ) {
            for (int j = 0; j < count; j++) {

                if (j % 2 == 0) {
                    System.out.print("***");
                } else {
                    System.out.print("+++");
                }
            }
            System.out.println();
        }
    }
}
