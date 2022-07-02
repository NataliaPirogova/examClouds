package com.tasks.lesson5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число");
        int x = sc.nextInt();
        if (x <= 10 && x >= 0) {
            System.out.println("Положительное число меньше 10 или ноль");
        } else {
            System.out.println("Положительное число больше 10 или отрицательное");
        }
    }
}
