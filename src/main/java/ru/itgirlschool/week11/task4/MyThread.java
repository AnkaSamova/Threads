package ru.itgirlschool.week11.task4;

import java.util.Random;

public class MyThread implements Runnable {
    private final int distance;
    private int distanceTraveled;

    public MyThread(int distance) {
        this.distance = distance;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (distanceTraveled < distance) {
            int speed = random.nextInt(5) + 1;
            distanceTraveled += speed;
        }
        System.out.println(Thread.currentThread().getName() + " финишировала!");
    }
}