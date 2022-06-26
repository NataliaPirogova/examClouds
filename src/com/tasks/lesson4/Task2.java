package com.tasks.lesson4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите три числа:");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            a = (a < 0 ? -a : a);
            b = (b < 0 ? -b : b);
            c = (c < 0 ? -c : c);
            int min = 0;
            if (a < b) {
                if (a < c) {
                    min = a;
                }
                if (a > c) {
                    if (c < b) {
                        min = c;
                    } else {
                        min = b;
                    }
                }
            } else {
                if (b < c) {
                    min = b;
                } else {
                    min = c;
                }
            }
            System.out.println(min);
        }

    }
}
