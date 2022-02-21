package com.progacademy.homework5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMirror {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int arrayLength = scanner.nextInt();

        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Введите " + i + "-й элемент массива: ");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length / 2; i++) {
            int rep = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
        }

        System.out.println("Вывожу зеркальный массив на экран: ");
        System.out.println(Arrays.toString(array));
    }
}
