package com.tasks.lesson10;

public class Circle {
    int radius;
    static final double PI = 3.14;

    public Circle(int radius) {
        this.radius = radius;
    }

    //площадь
    public double getSquare() {
        return PI * radius * radius;
    }

    //длина окружности
    public double getLengthCircumference() {
        return 2 * PI * radius;
    }
}
