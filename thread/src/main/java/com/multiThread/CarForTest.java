package com.multiThread;

public class CarForTest {
    void startEngine() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println(Thread.currentThread().getName());
        System.out.println("Engine started");

        /*System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your car name : ");
        String stringYourCarName = scanner.nextLine();
        System.out.println("This is your car name : "+stringYourCarName);*/
    }
}
