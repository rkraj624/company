package com.company.thread.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    private boolean isAvailable = false;
    public void producer(ReentrantLock reentrantLock){
        try{
            reentrantLock.lock();
            System.out.println("Lock acquired by "+Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);
        }catch (Exception ex){

        }finally {
            reentrantLock.unlock();
            System.out.println("Lock released by "+Thread.currentThread().getName());
        }
    }
}
