package com.progacademy;
/*      Преобразование типов
        Классы:
        Integer, Long, Short, Boolean, Char, Byte.

        Преобразование числа в строку:
        String t = Integer.toString(123);
        String t = Long.toString(123);
        String t = Integer.toString(123, 16);

        Преобразование строки в число:
        int n = Integer.parseInt("123");
        long n = Long.parseInt("123");
        double n = Double.valueOf("123");

 */

public class ValueConversion {
    public static void main(String[] args) {
        int a = 34;
        String text = "" + a;
        System.out.println(text);

        String textOne = Double.toString(34.53);
        System.out.println(textOne);

        int b = Integer.parseInt("23");

    }
}
