package com.tasks.lesson14;

import org.jetbrains.annotations.NotNull;

public class Task1 {
    public static void main(String[] args) {
        String s = "I like Java!!!";
        workString(s);
    }

    public static void workString(@NotNull String str) {
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.contains("Java"));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.replace('a', 'o'));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(str.indexOf("Java"), str.indexOf("Java") + 4));
    }
}
