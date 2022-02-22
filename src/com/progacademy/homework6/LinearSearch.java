package com.progacademy.homework6;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 3, 5, 7, 11};
        System.out.println("Вывожу массив на экран:");
        System.out.println(Arrays.toString(array));

        System.out.println("Введите элемент который нужно найти: ");
        int element = scanner.nextInt();

        System.out.println(search(array, element));
    }

    public static int search(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
