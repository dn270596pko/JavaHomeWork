package com.progacademy.homework5;

public class ArrayRotate {
    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6}};

        System.out.println("Начальное состояние массива:");
        for (int indexLine = 0; indexLine < array.length; indexLine++) {
            for (int indexColumn = 0; indexColumn < array[indexLine].length; indexColumn++) {
                System.out.print(array[indexLine][indexColumn] + "\t");
            }
            System.out.println();
        }

        for (int i = 1; i <= 3; i++) {
            int x;
            for (int j = 0; j < array.length / 2; j++) {
                for (int k = j; k < array.length - 1 - j; k++) {
                    x = array[j][k];
                    array[j][k] = array[array.length - 1 - k][j];
                    array[array.length - 1 - k][j] = array[array.length - 1 - j][array.length - 1 - k];
                    array[array.length - 1 - j][array.length - 1 - k] = array[k][array.length - 1 - j];
                    array[k][array.length - 1 - j] = x;
                }
            }
            System.out.println();
            System.out.println("Массив повернут на " + i * 90 + " градусов:");
            for (int indexLine = 0; indexLine < array.length; indexLine++) {
                for (int indexColumn = 0; indexColumn < array[indexLine].length; indexColumn++) {
                    System.out.print(array[indexLine][indexColumn] + "\t");
                }
                System.out.println();
            }
        }
    }
}