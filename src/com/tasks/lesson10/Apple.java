package com.tasks.lesson10;

public class Apple extends Fruit {
    int price;

    @Override
    public double getPrice(double weight) {
        return weight * price;
    }

    public Apple() {
        printManufacturerInfo();
        System.out.println();
    }

    public Apple(int price) {
        this.price = price;
        printManufacturerInfo();
        System.out.println();
    }

    public Apple(double weight, int price) {
        this.weight = weight;
        this.price = price;
        printManufacturerInfo();
        System.out.println();
    }
}
