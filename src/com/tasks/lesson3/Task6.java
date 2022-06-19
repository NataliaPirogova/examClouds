package com.tasks.lesson3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        sum();
    }

    public static void sum() {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа");
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
            if (scanner.hasNextInt()) {
                b = scanner.nextInt();
                int sum = a + b;
                System.out.println(sum);
            } else {
                System.out.println("Второе число введено неправильно. Введите два целочисленных значения");
            }
        } else {
            System.out.println("Введено неправильное число. Введите целочисленное значение");
        }
    }
}
