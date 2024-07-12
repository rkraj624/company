package com.company.thread;

public class Main {
    public static void main(String[] args) {
        System.out.println("Going inside main method : " + Thread.currentThread().getName());
        MultiThreadingViaRunnableInterface runnableObject = new MultiThreadingViaRunnableInterface();
        Thread thread = new Thread(runnableObject);
        thread.start();
        MultiThreadingViaExtendingThread multiThreadingViaExtendingThread = new MultiThreadingViaExtendingThread();
        multiThreadingViaExtendingThread.start();
        System.out.println("Finished main method : " + Thread.currentThread().getName());
    }

}
