package com.tasks.lesson27;

public class Task1 {
    public static void main(String[] args) {
        NewThread newThread = new NewThread();
        newThread.start();
    }
}

class NewThread extends Thread {

    public NewThread() {
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println('N');
        }
    }
}