package com.multiThread;

public class MyThreadThree extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Inside method run in MyThreadThree");
    }
}
