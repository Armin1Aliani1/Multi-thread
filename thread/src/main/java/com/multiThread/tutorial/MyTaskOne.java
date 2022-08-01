package com.multiThread.tutorial;

public class MyTaskOne implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Inside method run MyTaskOne...");
    }
}
