package com.multiThread.test;

public class MultithreadingDemo extends Thread {
    public static void main(String args[]) {
        MultithreadingDemo obj = new MultithreadingDemo();
        obj.start();
    }

    public void run() {
        System.out.println("My thread is in running state.");
    }
}