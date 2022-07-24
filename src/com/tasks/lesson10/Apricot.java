package com.tasks.lesson10;

public class Apricot extends Fruit {
    int price;

    @Override
    public double getPrice(double weight) {
        return weight * price;
    }

    public Apricot() {
        printManufacturerInfo();
        System.out.println();
    }

    public Apricot(int price) {
        this.price = price;
        printManufacturerInfo();
        System.out.println();
    }

    public Apricot(double weight, int price) {
        this.weight = weight;
        this.price = price;
        printManufacturerInfo();
        System.out.println();
    }
}
