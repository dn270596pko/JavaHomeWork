package com.progacademyoop.homework.homework1a;

public class Market {
    private String product;
    private double price;
    private double weight;

    public Market(String product, double price, double weight) {
        this.product = product;
        this.price = price;
        this.weight = weight;
    }

    public Market() {
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Market{" +
                "product='" + product + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}
