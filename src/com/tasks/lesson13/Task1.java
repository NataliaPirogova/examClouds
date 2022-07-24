package com.tasks.lesson13;

//Создайте объекты класса Double, используя методы valueOf().
//        Преобразовать значение типа String к типу double. Используем метод Double.parseDouble().
//        Преобразовать объект класса Double ко всем примитивным типам.
//        Вывести значение объекта Double на консоль.
//        Преобразовать литерал типа double к строке: String d = Double.toString(3.14);

public class Task1 {
    public static void main(String[] args) {
        Double double1 = Double.valueOf(1.0);
        Double double2 = Double.valueOf("2.3");
        System.out.println(double1);
        System.out.println(double2);

        Double double3 = Double.parseDouble("241.44");
        System.out.println(double3);

        System.out.println(double1.byteValue());
        System.out.println(double2.shortValue());
        System.out.println(double3.intValue());
        System.out.println(double2.longValue());
        System.out.println(double3.floatValue());

        System.out.println(double1);

        String d = Double.toString(3.14);
        System.out.println(d);
    }
}
