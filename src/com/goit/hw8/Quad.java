package com.goit.hw8;

//Клас Quad, який також наслідується від Shape та реалізує методи getArea() та getName():
public class Quad extends Shape {
    private int width;
    private int height;

    public Quad(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String getName() {
        return "Quad";
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
