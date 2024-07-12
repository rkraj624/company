package com.company.thread.StampedLock;

import java.util.concurrent.locks.StampedLock;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        StampedLock stampedLock = new StampedLock();

        new Thread(()->{
            try{
                sharedResource.producer(stampedLock);
            }catch (Exception ex){

            }
        }).start();
        new Thread(()->{
            try{
                sharedResource.producer(stampedLock);
            }catch (Exception ex){

            }
        }).start();
        new Thread(()->{
            try{
                sharedResource.consume(stampedLock);
            }catch (Exception ex){

            }
        }).start();
    }
}
