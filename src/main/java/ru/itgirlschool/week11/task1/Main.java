package ru.itgirlschool.week11.task1;

public class Main {
    public static void main(String[] args) {
        Object lock = new Object();
        Thread thread0 = new Thread(new MyThread(lock));
        Thread thread1 = new Thread(new MyThread(lock));
        thread0.start();
        thread1.start();
    }
}