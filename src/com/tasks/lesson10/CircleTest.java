package com.tasks.lesson10;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(2);
        Circle c2 = new Circle(3);
        Circle c3 = new Circle(4);

        System.out.println("Первый круг площадью " + c1.getSquare() + " и длиной окружности " + c1.getLengthCircumference());
        System.out.println("Второй круг площадью " + c2.getSquare() + " и длиной окружности " + c2.getLengthCircumference());
        System.out.println("Третий круг площадью " + c3.getSquare() + " и длиной окружности " + c3.getLengthCircumference());
    }
}
