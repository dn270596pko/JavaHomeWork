package com.progacademy.homework5;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayFilling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int arrayLength = scanner.nextInt();

        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i ++) {
            System.out.println("Введите " + i + "-й элемент массива: ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Вывожу массив на экран: ");
        System.out.println(Arrays.toString(array));
    }
}
