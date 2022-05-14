package com.progacademystart.homework6;

import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println("Количество слов: " + countWorld(str));

    }

    public static int countWorld(String str) {
        int count = 0;
        if (str.length() != 0) {
            count++;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        return count;
    }
}
