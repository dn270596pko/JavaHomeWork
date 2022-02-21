package com.progacademy.lectures;
import java.util.Arrays;

public class Lecture5 {
    public static void main(String[] args) {

        int[] pay = new int [12];
        for (int i =0; i < pay.length; i++ ) {
            pay[i] = (int) (20000 + Math.random() * 10000);
        }
        System.out.println(Arrays.toString(pay));
        int sum = 0;

        for (int i = 0; i < pay.length; i++ ) {
            sum = sum + pay[i];
        }
        System.out.println("Средняя ЗП: " + sum/pay.length);
    }
}
