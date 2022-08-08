package com.tasks.lesson23;

import com.tasks.lesson10.Apple;

import java.util.Arrays;

public class Task1 {
    public static void printInfo(Class class1) {
        System.out.println("Класс расположен в пакете " + class1.getPackage());
        System.out.println("Название класса " + class1.getName());
        System.out.println("Методы класса " + Arrays.toString(class1.getMethods()));
        System.out.println("Конструкторы класса " + Arrays.toString(class1.getConstructors()));
    }

    public static void main(String[] args) {
        printInfo(Apple.class);
    }
}
