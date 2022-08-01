package com.tasks.lesson18;

import java.util.function.Predicate;

public class Task3 {
    public static void main(String[] args) {
        Predicate<String> predicateJ = s -> s.startsWith("J");
        Predicate<String> predicateN = s -> s.startsWith("N");
        Predicate<String> predicateA = s -> s.endsWith("A");
        Predicate<String> predicate = s -> predicateJ.or(predicateN).and(predicateA).test(s);
        System.out.println(predicate.test("fohnA"));
    }
}
