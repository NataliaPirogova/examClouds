package com.tasks.lesson10;

public class Pear extends Fruit {
    int price;

    @Override
    public double getPrice(double weight) {
        return weight * price;
    }

    public Pear() {
        printManufacturerInfo();
        System.out.println();
    }

    public Pear(int price) {
        this.price = price;
        printManufacturerInfo();
        System.out.println();
    }

    public Pear(double weight, int price) {
        this.weight = weight;
        this.price = price;
        printManufacturerInfo();
        System.out.println();
    }
}
