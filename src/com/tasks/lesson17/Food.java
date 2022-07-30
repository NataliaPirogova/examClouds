package com.tasks.lesson17;
//Task5
public class Food {
    public static void main(String[] args) {
        Food food = new Food();
        Cookable co = new Cookable() {
            @Override
            public void cook(String str) {
                System.out.printf("Готовим %s", str);
            }
        };
        food.prepare(co, "лосось");
    }

    public void prepare(Cookable c, String str) {
        c.cook(str);
    }
}