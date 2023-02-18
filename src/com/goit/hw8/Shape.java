package com.goit.hw8;

//Базовий клас Shape, який визначає загальний інтерфейс для всіх фігур. Цей клас має
//методи для встановлення та отримання координат фігури, метод для отримання
//площі та метод для виведення назви фігури:
public abstract class Shape {
    protected int x;
    protected int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract double getArea();

    public abstract String getName();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
