package com.tasks.lesson17;

//Task3
public class User3 {
    private static String login;
    private static String password;

    public static void initialize(String login, String password) {
        User3.login = login;
        User3.password = password;
    }

    public static class Query {
        public void printToLog() {
            System.out.printf("Пользователь c логином %s и паролем %s отправил запрос\n", login, password);
        }
    }

    public static void main(String[] args) {
        initialize("natalia", "1234");
        User3.Query query1 = new User3.Query();
        query1.printToLog();
    }
}
