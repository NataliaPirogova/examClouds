package com.tasks.lesson18;

import java.util.function.Predicate;

public class Task2 {
    public static void main(String[] args) {
        Predicate<String> predicate = s -> s != null;
        //        System.out.println(predicate.test("Iva"));

        Predicate<String> predicate1 = s -> !s.isEmpty();
        //     System.out.println(predicate1.test(""));

        System.out.println(predicate.and(predicate1).test("lol"));
    }

}
