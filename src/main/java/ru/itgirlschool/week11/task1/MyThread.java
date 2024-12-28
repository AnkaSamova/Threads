package ru.itgirlschool.week11.task1;

public class MyThread implements Runnable {
    private static int number = 1;
    private final Object lock;

    public MyThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        while (number <= 10) {
            synchronized (lock) {
                try {
                    System.out.println(Thread.currentThread().getName() + " " + number);
                    number++;
                    lock.notify();
                    if (number <= 10) {
                        lock.wait();
                    }
                } catch (InterruptedException e) {
                    System.out.println("Interrupted");
                }
            }
        }
    }
}