package com.tasks.lesson7;

public class Task1 {
    public static void main(String[] args) {
        int[] massive = new int[]{0, 2, 5, 3, 4};

        for (int i = 0; i <= massive.length - 1; i++) {
            for (int j = massive.length - 1; j > i; j--) {
                System.out.print(i + "   " + j + "   ");
                if (massive[j] < massive[j - 1]) {
                    int temp = massive[j];
                    massive[j] = massive[j - 1];
                    massive[j - 1] = temp;
                    for (int k = 0; k < (massive.length); k++) {
                        System.out.print(massive[k]);
                    }
                    System.out.print("   +");
                } else {
                    for (int k = 0; k < (massive.length); k++) {
                        System.out.print(massive[k]);
                    }
                    System.out.print("  -");
                }
                System.out.println();
            }
        }
    }
}