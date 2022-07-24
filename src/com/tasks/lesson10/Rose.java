package com.tasks.lesson10;

//роза
public class Rose extends Flower {
    Rose() {
        super();
    }

    Rose(String country) {
        super();
        this.country = country;
    }

    Rose(String country, int expirationDate) {
        super();
        this.country = country;
        this.expirationDate = expirationDate;
    }

    Rose(String country, int expirationDate, double price) {
        super();
        this.country = country;
        this.expirationDate = expirationDate;
        this.price = price;
    }
}
