package com.multiThread.test;

public class MyTaskOne implements Runnable {
    @Override
    public void run() {
        System.out.println("Before sleeping");
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("This is run MyTask !!!!");
    }
}
