package com.multiThread;

public class ApplicationMultiThread {
    public static void main(String[] args) throws InterruptedException {

        String stringThreadName = Thread.currentThread().getName();
        System.out.println("Hi");
        System.out.println("String thread name : " + stringThreadName);
        System.out.println("Bye");

        System.out.println();

        MyThreadOne myThreadOne = new MyThreadOne();
        System.out.println("This is name method start for MyThreadOne : ");
        myThreadOne.start();
        System.out.println("This is name method run for MyThreadOne : ");
        myThreadOne.run();
        myThreadOne.join();

        System.out.println();

        MyThreadTwo myThreadTwo = new MyThreadTwo();
        System.out.println("This is name method start for MyThreadTwo : ");
        myThreadTwo.start();
        System.out.println("This is name method run for MyThreadTwo : ");
        myThreadTwo.run();

        System.out.println();

        MyThreadThree myThreadThree = new MyThreadThree();
        System.out.println("This is name method start for MyThreadThree : ");
        myThreadThree.start();
        System.out.println("This is name method run for MyThreadThree : ");
        myThreadThree.run();
//        myThreadThree.join();

        System.out.println();

        MyTaskOne myTaskOne = new MyTaskOne();
        myTaskOne.run();

        System.out.println();

        Thread thread = new Thread(myTaskOne);
        thread.start();

        System.out.println();

        Car car = new Car();
        car.startEngine();

    }
}
