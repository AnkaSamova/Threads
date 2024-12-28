package ru.itgirlschool.week11.task3;

public class MyThread implements Runnable {
    private final int n;
    private static int count = 1;
    private static long res;

    public MyThread(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 1; i <= n / 2; i++) {
            res += (long) Math.pow(count, 2);
            count++;
        }
    }

    public long getRes() {
        return res;
    }
}