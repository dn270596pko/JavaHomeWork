package com.progacademy.homework3;
import java.util.Scanner;

public class Courier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер квартиры: ");
        int apartmentNumber = scanner.nextInt();

        if (apartmentNumber < 1 || apartmentNumber > 144) {
            System.out.println("Такой квартире в доме нет.");
        } else {
            int entrance = (apartmentNumber - 1) / 36 + 1;
            int floor = (apartmentNumber - 1) % 36 / 4 + 1;
            System.out.println("Подъезд № " + entrance + ", этаж " + floor + "й");
        }

    }
}
