package com.tasks.lesson17;

//Task1
public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery() {
        Query q = new Query();
        q.printToLog();
    }

    public class Query {
        public void printToLog() {
            System.out.printf("Пользователь c логином %s и паролем %s отправил запрос\n", login, password);
        }
    }

    public static void main(String[] args) {
        User user1 = new User("natalia", "1234");
        user1.createQuery();
        Query query1 = user1.new Query();
        query1.printToLog();
        Query query2 = new User("raisa", "0000").new Query();
        query2.printToLog();
    }
}
