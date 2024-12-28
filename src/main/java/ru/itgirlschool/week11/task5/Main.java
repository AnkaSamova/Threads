package ru.itgirlschool.week11.task5;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread());
        thread1.setName("Поток 1");
        Thread thread2 = new Thread(new MyThread());
        thread2.setName("Поток 2");

        thread2.start();
        thread1.start();
    }
}