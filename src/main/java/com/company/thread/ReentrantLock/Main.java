package com.company.thread.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

/*
* @description : ReentrantLock is not based on object it is based on lock.
* If multiple threads with multiple or single shared resources cannot access
* critical section once lock is acquired.
* */


public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource1 = new SharedResource();
        SharedResource sharedResource2 = new SharedResource();
        ReentrantLock reentrantLock = new ReentrantLock();
        new Thread(()->{
            try{
                sharedResource1.producer(reentrantLock);
            }catch (Exception ex){

            }
        }).start();
        new Thread(()->{
            try{
                sharedResource2.producer(reentrantLock);
            }catch (Exception ex){

            }
        }).start();
    }
}
