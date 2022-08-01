package com.multiThread.practice;

public class ApplicationForTestThread {
    public static void main(String[] args) throws InterruptedException {

        ThreadOne threadOne = new ThreadOne();
        threadOne.start();
        Thread.sleep(5000);
        threadOne.interrupt();

        /*for (int i = 0; i <= 50; i++){
            System.out.println("Local date time : "+new Date());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted Thread Exception...");
                e.printStackTrace();
            }
        }*/
    }
}
