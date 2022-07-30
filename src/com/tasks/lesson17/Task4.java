package com.tasks.lesson17;

public class Task4 {
    public static void main(String[] args) {
        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("Анонимный класс");
            }
        };
        printable.print();
    }
}