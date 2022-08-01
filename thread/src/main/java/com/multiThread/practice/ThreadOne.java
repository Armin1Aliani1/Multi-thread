package com.multiThread.practice;

import java.util.Date;

public class ThreadOne extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Local date time : " + new Date());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted Thread Exception...");
                System.out.println("Interrupted time : " + new Date());
                return;
            }
        }
    }

}
