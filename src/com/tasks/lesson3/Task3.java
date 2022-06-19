package com.tasks.lesson3;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(difference(10, 3));
        System.out.println(product(10, 9));
        System.out.println(quotient(3, 0));
    }

    public static int sum(int a, int b) {
        return (a + b);
    }

    public static int difference(int a, int b) {
        return (a - b);
    }

    //произведение
    public static int product(int a, int b) {
        return (a * b);
    }

    //деление
    public static double quotient(int a, int b) {
        return (double) a / (double) b;
    }
}