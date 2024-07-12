package com.company.thread.ReadWriteLock;



import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/*
* ReadWriteLock is used generally when your read is very high 1000:10 read write ratio
* */

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

        new Thread(()->{
            try{
                sharedResource.producer(readWriteLock);
            }catch (Exception ex){

            }
        }).start();
        new Thread(()->{
            try{
                sharedResource.producer(readWriteLock);
            }catch (Exception ex){

            }
        }).start();
        new Thread(()->{
            try{
                sharedResource.consume(readWriteLock);
            }catch (Exception ex){

            }
        }).start();
    }
}
