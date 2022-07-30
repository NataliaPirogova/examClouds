package com.tasks.lesson14;

public class Task2 {
    public static void main(String[] args) {
        int a1 = 3, a2 = 56;
        StringBuilder str1 = new StringBuilder();
        str1.append(a1).append(" + ").append(a2).append(" = ").append(a1 + a2);
        System.out.println(str1);
        StringBuilder str2 = new StringBuilder();
        str2.append(a1).append(" - ").append(a2).append(" = ").append(a1 - a2);
        System.out.println(str2);
        StringBuilder str3 = new StringBuilder();
        str3.append(a1).append(" * ").append(a2).append(" = ").append(a1 * a2);
        System.out.println(str3);
        System.out.println(str1.deleteCharAt(7).insert(7,"равно"));
        System.out.println(str2.replace(7,8,"равно"));
    }
}
