package com.tasks.lesson2.vehicles;

import com.tasks.lesson2.details.Engine;
import com.tasks.lesson2.professions.Driver;

public class Car {
    public static void main(String[] args) {
        Engine engine1 = new Engine();
        Driver driver1 = new Driver();
        System.out.println("I'm driving!");

        for (String str :
                args) {
            System.out.println("Value: " + str);
        }
    }
}
