package com.progacademy.homework5;
import java.util.Scanner;

public class CountSymbol {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'b') {
                count ++;
            }
        }
        System.out.println("Количество символов 'b': " + count);
    }
}
