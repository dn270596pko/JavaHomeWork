package com.progacademystart.homework5;
import java.util.Arrays;

public class ArrayRandom {
    public static void main(String[] args) {

        int[] array = new int [15];

        for (int i = 0; i < array.length; i++)
            array[i] = ((int) (Math.random() * 10));

        int[] bigArray = Arrays.copyOf(array, 30);

        for (int i = array.length; i < bigArray.length; i++)
            bigArray[i] = array[(i - array.length)] * 2;
        System.out.println(Arrays.toString(bigArray));


    }
}
