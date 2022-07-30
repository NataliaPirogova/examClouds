package com.tasks.lesson17;

//Task 9
public class Calculator {
    public static <T extends Number, K extends Number> void sum(T t, K k) {
        double sum = t.doubleValue() + k.doubleValue();
        System.out.println(sum);
    }

    public static <T extends Number, K extends Number> void multiply(T t, K k) {
        System.out.println((Double) t * (Double) k);
    }

    public static <T extends Number, K extends Number> void divide(T t, K k) {
        System.out.println((Double) t / (Double) k);
    }

    public static <T extends Number, K extends Number> void subtraction(T t, K k) {
        System.out.println((Double) t - (Double) k);
    }

    public static void main(String[] args) {
        sum(3.2, 1);
//        multiply(6.0,8);
//        divide(2.2,11);
//        subtraction(109.8,20);
    }
}
