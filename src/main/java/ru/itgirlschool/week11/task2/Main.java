package ru.itgirlschool.week11.task2;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread());
        thread1.setName("Поток 1");
        Thread thread2 = new Thread(new MyThread());
        thread2.setName("Поток 2");

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        thread2.start();
    }
}