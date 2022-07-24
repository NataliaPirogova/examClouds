package com.tasks.lesson10;

//тюльпан
public class Tulip extends Flower {
    Tulip() {
        super();
    }

    Tulip(String country) {
        super();
        this.country = country;
    }

    Tulip(String country, int expirationDate) {
        super();
        this.country = country;
        this.expirationDate = expirationDate;
    }

    Tulip(String country, int expirationDate, double price) {
        super();
        this.country = country;
        this.expirationDate = expirationDate;
        this.price = price;
    }
}
