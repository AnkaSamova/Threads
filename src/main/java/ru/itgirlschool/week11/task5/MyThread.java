package ru.itgirlschool.week11.task5;

public class MyThread implements Runnable {

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("Поток 2")) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }

        for (int i = 1; i < 11; i++) {
            System.out.print(Thread.currentThread().getName() + "-" + i + ", ");
            try {
                Thread.sleep(1000);
                if (Thread.currentThread().getName().equals("Поток 1")) {
                    Thread.sleep(200);
                }
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }
}