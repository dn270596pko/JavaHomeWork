package com.progacademy.lectures;

public class Lecture6 {
    public static void main(String[] args) {

        int[] array = new int[]{7, 2, 5, 1, 9, -1};
        int s = sum(array);

        System.out.println(s);
    }

    public static int sum(int[] array) {
        int arraySum = 0;
        for (int i = 0; i < array.length; i++) {
            arraySum = arraySum + array[i];
        }
        return arraySum;
    }
}
