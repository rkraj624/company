package com.company.thread;

public class MultiThreadingViaExtendingThread extends Thread{
    @Override
    public void run() {
        System.out.println("code executed by the thread : "+Thread.currentThread().getName());
    }
}
