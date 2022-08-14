package com.tasks.lesson27;

public class Task2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new newRun(), "Thread1");
        Thread thread2 = new Thread(new newRun(), "Thread2");
        Thread thread3 = new Thread(new newRun(), "Thread3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class newRun implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 10 == 0) {
                System.out.println(i + " " + Thread.currentThread().getName());
            }
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}