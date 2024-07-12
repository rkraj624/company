package com.company.thread;

public class MultiThreadingViaRunnableInterface implements Runnable{
    @Override
    public void run() {
        System.out.println("code executed by the thread : "+Thread.currentThread().getName());
    }
}
