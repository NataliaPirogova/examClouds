package com.tasks.lesson5;

import org.jetbrains.annotations.NotNull;

public class Task1 {
    public static void main(String @NotNull [] args) {
        int x = Integer.parseInt(args[0]);
        if (x % 2 == 1) {
            System.out.println(x);
        } else {
            System.out.println("число четное");
        }
    }
}

