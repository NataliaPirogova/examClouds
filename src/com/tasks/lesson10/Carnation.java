package com.tasks.lesson10;

//гвоздика
public class Carnation extends Flower {
    Carnation() {
        super();
    }

    Carnation(String country) {
        super();
        this.country = country;
    }

    Carnation(String country, int expirationDate) {
        super();
        this.country = country;
        this.expirationDate = expirationDate;
    }

    Carnation(String country, int expirationDate, double price) {
        super();
        this.country = country;
        this.expirationDate = expirationDate;
        this.price = price;
    }
}
