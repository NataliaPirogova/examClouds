package com.tasks.lesson10;

public class FruitShop {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[10];
        fruits[0] = new Apple(1.0, 3);
        fruits[1] = new Apricot(0.7, 10);
        fruits[2] = new Pear(0.9, 7);
        fruits[3] = new Apple(3.0, 5);
        fruits[4] = new Apricot(1.1, 3);
        fruits[5] = new Pear(0.35, 2);
        fruits[6] = new Apple(2.7, 3);
        fruits[7] = new Apricot(0.2, 21);
        fruits[8] = new Pear(2.0, 4);
        fruits[9] = new Pear(4, 2);

        System.out.println("Общая стоимость проданных фруктов: " + getSummFruit(fruits));
        System.out.println("Общая стоимость проданных яблок: " + getSummApple(fruits));
        System.out.println("Общая стоимость проданных абрикосов: " + getSummApricot(fruits));
        System.out.println("Общая стоимость проданных груш: " + getSummPear(fruits));
    }

    static double getSummFruit(Fruit[] fruits) {
        double summFruit = 0.0;
        for (Fruit fr :
                fruits) {
            summFruit += fr.getPrice(fr.weight);
        }
        return summFruit;
    }

    static double getSummApple(Fruit[] fruits) {
        double summApple = 0;
        for (Fruit fr :
                fruits) {
            if (fr instanceof Apple)
                summApple += fr.getPrice(fr.weight);
        }
        return summApple;
    }

    static double getSummApricot(Fruit[] fruits) {
        double summApricot = 0;
        for (Fruit fr :
                fruits) {
            if (fr instanceof Apricot)
                summApricot += fr.getPrice(fr.weight);
        }
        return summApricot;
    }

    static double getSummPear(Fruit[] fruits) {
        double summPear = 0;
        for (Fruit fr :
                fruits) {
            if (fr instanceof Pear)
                summPear += fr.getPrice(fr.weight);
        }
        return summPear;
    }
}
