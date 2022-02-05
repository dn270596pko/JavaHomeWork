package com.javarush.arrays;
import java.util.Scanner;
//        Считать 6 строк и заполнить ими массив strings.
//        Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").
//       Пример начального массива:  {"Hello", "Hello", "World", "Java", "Tasks", "World"}
//       Пример измененного массива: {null, null, null, "Java", "Tasks", null}
public class ArraysNull {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        strings = new String[6];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }


        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].equals(strings[j])) {
                    strings[i] = "null";
                    strings[j] = "null";
                }
            }
        }
        for (int j = 0; j < strings.length; j++) {
            if (strings[j].equals("null")){
                strings[j] = null;
            }
        }

            for (int i = 0; i < strings.length; i++)
                System.out.print(strings[i] + ", ");

    }
}
