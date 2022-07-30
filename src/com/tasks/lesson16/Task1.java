package com.tasks.lesson16;

import java.time.LocalDate;

public class Task1 {
    public static void main (String[] args){
        LocalDate DoB = LocalDate.of(1995,4,16);
        System.out.println("День недели, в который я родилась: "+DoB.getDayOfWeek());
        System.out.println("День года, в который я родилась: "+DoB.getDayOfYear());
        System.out.println("Месяц, в который я родилась: "+DoB.getMonth());
        System.out.println("Год, в который я родилась: "+DoB.getYear());
        LocalDate current = LocalDate.now();
        System.out.println(current.isAfter(DoB));
        System.out.println(current.isBefore(DoB));
    }
}
