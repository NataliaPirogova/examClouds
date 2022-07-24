package com.tasks.lesson10;

public abstract class Fruit {
    double weight;

    //завершенный метод
    public final void printManufacturerInfo() {
        System.out.print("Made in Ukraine");
    }

    //абстрактный метод, возвращающий стоимость фрукта,
    // который должен быть переопределен в каждом классе наследнике. Метод должен учитывать вес фрукта
    public abstract double getPrice(double weight);
}
