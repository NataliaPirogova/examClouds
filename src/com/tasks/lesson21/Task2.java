package com.tasks.lesson21;

import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        try (OutputStream output = new FileOutputStream("src/io/a.txt");
             InputStream input = new FileInputStream("src/io/a.txt")) {
            char[] symbols = {'a', 'b', 'c'};
            for (char symbol : symbols) {
                // Запись каждого символа в текстовый файл
                output.write(symbol);
            }

            int size = input.available();

            for (int i = 0; i < size; i++) {
                // Чтение текстового файла посимвольно
                System.out.print((char) input.read() + " ");
            }
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
