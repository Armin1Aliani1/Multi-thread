package com.multiThread;

public class MyThreadTwo extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Inside method run in MyThreadTwo");

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your full name : ");
        String stringYourFullName = scanner.nextLine();
        System.out.println("This is your full name : "+stringYourFullName);*/
    }
}
