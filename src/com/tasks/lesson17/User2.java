package com.tasks.lesson17;

//Task2
public class User2 {
    private String login;
    private String password;

    public User2() {
    }

    public User2(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery() {
        class Query {
            public void printToLog() {
                System.out.printf("Пользователь c логином %s и паролем %s отправил запрос\n", login, password);
            }
        }
        Query q = new Query();
        q.printToLog();
    }

    public class Query {
        public void printToLog() {
            System.out.printf("Пользователь c логином %s и паролем %s отправил запрос\n", login, password);
        }
    }

    public static void main(String[] args) {
        User2 user1 = new User2("natalia", "1234");
        user1.createQuery();
        User2.Query query1 = user1.new Query();
        query1.printToLog();
        User2.Query query2 = new User2("raisa", "0000").new Query();
        query2.printToLog();
    }
}
