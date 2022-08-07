package com.tasks.lesson21;

import java.io.*;

public class Task3 {
    public static void main(String[] args) {
        try (BufferedReader bfr = new BufferedReader(new FileReader("src\\com\\tasks\\lesson21\\Origin.txt"));
             BufferedWriter bfw = new BufferedWriter(new FileWriter("src\\com\\tasks\\lesson21\\Twin.txt"))) {
            String str;
            while ((str = bfr.readLine()) != null) {
                bfw.newLine();
                bfw.append(str);
            }
            System.out.println("Done");
        } catch (IOException e) {
            System.out.println("Something wrong");
        }
    }
}
