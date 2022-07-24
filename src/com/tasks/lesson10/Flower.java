package com.tasks.lesson10;

public class Flower {
    String country;
    int expirationDate;
    double price;
    static int count = 0;

    Flower() {
        count++;
    }

    Flower(String country) {
        this();
        this.country = country;
    }

    Flower(String country, int expirationDate) {
        this(country);
        this.expirationDate = expirationDate;
    }

    Flower(String country, int expirationDate, double price) {
        this(country, expirationDate);
        this.price = price;
    }
}
