package com.multiThread.tutorial;

public class MyThreadOne extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Inside method run in MyThreadOne");
    }
}
