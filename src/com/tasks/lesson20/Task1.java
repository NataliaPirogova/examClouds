package com.tasks.lesson20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(confirm("1234", "1111", "1111"));
    }

    static boolean confirm(String login, String password, String confirmPassword) {
        try {
            String regex = "[a-zA-Z]*\\d*_*^\\s*";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcherLogin = pattern.matcher(login);
            Matcher matcherPassword = pattern.matcher(password);
            if (login.length() >= 20 || !matcherLogin.find()) {
                throw new WrongLoginException();
            }
            if (!password.equals(confirmPassword) || password.length() >= 20 || !matcherPassword.find()) {
                throw new WrongPasswordException();
            }
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Неверный логин или пароль");
            e.printStackTrace();
            return false;
        }
    }
}

class WrongLoginException extends Exception {
    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "WrongLoginException{}" + getMessage();
    }
}

class WrongPasswordException extends Exception {
    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "WrongPasswordException{}" + getMessage();
    }
}