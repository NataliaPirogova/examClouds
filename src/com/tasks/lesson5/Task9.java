package com.tasks.lesson5;

public class Task9 {
    public static void main(String[] args) {
        int n = (int) (5 * Math.random());
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Наше случайное число: " + n);
        System.out.println("Факториал числа: " + factorial);
    }
}
