package com.tasks;

import java.util.function.Function;
import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {
        String t = "One";
        Supplier<String> supplierStr = () -> t.toUpperCase();
        System.out.println(supplierStr.get());
    }
    }
