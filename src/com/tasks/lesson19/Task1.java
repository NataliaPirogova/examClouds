package com.tasks.lesson19;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
String string = "1, 2, 3, 4, 4, 5";
String [] strings = string.split(",");
List<String> list = new ArrayList<>(strings.length);
        for (String s:
             strings) {
            list.add(s);
        }
        for (String s1:
             list) {
        }

        System.out.println();

    }
}
