package com.tasks.lesson18;

import java.util.function.Function;

public class Task5 {
    public static void main(String[] args) {
        Function<Integer, String> function1 = integer -> {
            String result = "Ноль";
            if (integer > 0) {
                result = "Положительное число";
            }
            if (integer < 0) {
                result = "Отрицательное число";
            }
            return result;
        };
        System.out.println(function1.apply(0));
        System.out.println(function1.apply(-23));
        System.out.println(function1.apply(24));
    }
}
