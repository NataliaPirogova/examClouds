package com.tasks.lesson15;

import java.util.Locale;
import java.util.ResourceBundle;

public class Task1 {
    public static void main(String[] args) {
        Locale current = Locale.getDefault();
        Locale english = new Locale("en", "US");
        ResourceBundle rb = ResourceBundle.getBundle("themes", current);
        ResourceBundle rbEN = ResourceBundle.getBundle("themes", english);
        System.out.println(rb.keySet());
        System.out.println(rbEN.keySet());
    }
}
