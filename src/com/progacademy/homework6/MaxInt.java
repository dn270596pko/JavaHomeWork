package com.progacademy.homework6;

import java.util.Arrays;
import java.util.Scanner;

public class MaxInt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = ((int) (Math.random() * 100));
        }
        System.out.println("Вывожу массив случайных чисел, размером " + array.length + " элементов, на экран: ");
        System.out.println(Arrays.toString(array));

        int answer = max(array);
        System.out.println("Максимальный элемент массива: " + answer);
    }

    public static int max(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }
}
