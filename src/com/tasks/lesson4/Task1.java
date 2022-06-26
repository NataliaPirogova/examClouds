package com.tasks.lesson4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        Scanner scan = new Scanner(System.in);
        int number;
        if (scan.hasNextInt()){
            number = scan.nextInt();
            if(number%2 == 0){
                System.out.println("Число четное");
            }
            else {
                System.out.println("Число нечетное");
            }
        }
        else {
            System.out.println("Ошибка! Введенное число не является целым.");
        }
    }
}
