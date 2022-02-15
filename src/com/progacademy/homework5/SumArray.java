package com.progacademy.homework5;
import java.util.Arrays;

public class SumArray {
    public static void main(String[] args) {
        int[] array =  {0,5,2,4,7,1,3,19};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                sum = sum + array[i];
        }
        System.out.println("Сумма нечетных элементов массива: " + sum);
    }
}
