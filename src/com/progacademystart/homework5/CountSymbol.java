package com.progacademystart.homework5;
import java.util.Scanner;

public class CountSymbol {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();
        int count = 0;
        char[] t = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if (t[i] == 'b') {
                count ++;
            }
        }
        System.out.println("Количество символов 'b': " + count);
    }
}
