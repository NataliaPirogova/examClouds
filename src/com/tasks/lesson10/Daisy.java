package com.tasks.lesson10;

//маргаритка
public class Daisy extends Flower {
    Daisy() {
        super();
    }

    Daisy(String country) {
        super();
        this.country = country;
    }

    Daisy(String country, int expirationDate) {
        super();
        this.country = country;
        this.expirationDate = expirationDate;
    }

    Daisy(String country, int expirationDate, double price) {
        super();
        this.country = country;
        this.expirationDate = expirationDate;
        this.price = price;
    }
}
