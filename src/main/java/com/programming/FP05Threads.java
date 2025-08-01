package com.programming;

public class FP05Threads {

    public static void main(String[] args) {

        Runnable runnable = () -> {
            for (int i=0; i<10000; i++) {
                System.out.println(Thread.currentThread().getId() + ":" + i);
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        Thread thread1 = new Thread(runnable);
        thread1.start();

        Thread thread2 = new Thread(runnable);
        thread2.start();

    }

}
