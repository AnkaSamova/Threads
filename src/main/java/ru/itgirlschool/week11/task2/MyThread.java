package ru.itgirlschool.week11.task2;

public class MyThread implements Runnable {
    private static int number = 1;

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": число " + number);
            number++;
        }
    }
}