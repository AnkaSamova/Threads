package ru.itgirlschool.week11.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число:");
        int n = sc.nextInt();
        MyThread myThread0 = new MyThread(n);
        Thread thread0 = new Thread(myThread0);
        MyThread myThread1 = new MyThread(n + 1);
        Thread thread1 = new Thread(myThread1);
        thread0.start();
        try {
            thread0.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("Сумма квадратов первых " + n + "-натуральных чисел: " + myThread1.getRes());
    }
}