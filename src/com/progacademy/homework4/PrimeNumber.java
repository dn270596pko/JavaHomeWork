package com.progacademy.homework4;

public class PrimeNumber {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j <= i; j++) {
                if (j < i && i % j == 0)
                    break;
                else if (i % j == 0)
                    System.out.println(i);
            }
        }
    }
}
