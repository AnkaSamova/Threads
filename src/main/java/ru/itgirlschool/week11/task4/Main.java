package ru.itgirlschool.week11.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите расстояние трассы:");
        int distance = sc.nextInt();

        Thread car1 = new Thread(new MyThread(distance));
        car1.setName("Машина 1");
        Thread car2 = new Thread(new MyThread(distance));
        car2.setName("Машина 2");

        car1.start();
        car2.start();
    }
}