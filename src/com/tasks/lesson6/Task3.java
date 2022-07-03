package com.tasks.lesson6;

public class Task3 {
    public static void main(String[] args) {
        String[][] mass = new String[3][6];
        char ch = 'a';
        //String[][] mass = new String[][]{{"a1","a2","a3","a4","a5","a6"},{"b1","b2","b3","b4","b5","b6"},{"c1","c2","c3","c4","c5","c6"}};
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[0].length; j++) {
                mass[i][j] = ch + "" + (j + 1);
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
            ch++;
        }
//        mass[0]={"a1","a2","a3","a4","a5","a6"};
//        mass[1]={"b1","b2","b3","b4","b5","b6"};
//        mass[2]={"c1","c2","c3","c4","c5","c6"};
    }
}
