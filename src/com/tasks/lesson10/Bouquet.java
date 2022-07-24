package com.tasks.lesson10;

//букет
public class Bouquet {
    public static void main(String[] args) {
        Flower[] bouquet1 = new Flower[4];
        Flower[] bouquet2 = new Flower[2];
        Flower[] bouquet3 = new Flower[3];
        bouquet1[0] = new Carnation("Russia", 6, 2.8);
        bouquet1[1] = new Daisy("Russia", 10, 1.9);
        bouquet1[2] = new Daisy("Russia", 10, 2.0);
        bouquet1[3] = new Carnation("Russia", 6, 3.5);

        bouquet2[0] = new Rose("Poland", 12, 5.0);
        bouquet2[1] = new Rose("Poland", 15, 9.0);

        bouquet3[0] = new Tulip("Netherlands", 7, 3.0);
        bouquet3[1] = new Tulip("Netherlands", 7, 3.2);
        bouquet3[2] = new Tulip("Netherlands", 7, 3.3);

        System.out.println("Стоимость первого букета: " + calculatePrice(bouquet1));
        System.out.println("Стоимость второго букета: " + calculatePrice(bouquet2));
        System.out.println("Стоимость третьего букета: " + calculatePrice(bouquet3));
        System.out.println("Всего продано цветов: " + Flower.count);
    }

    static double calculatePrice(Flower[] bouquet) {
        double priceBouquet = 0;
        for (Flower f :
                bouquet) {
            priceBouquet += f.price;
        }
        return priceBouquet;
    }
}
