package com.company.thread.threadlifecycle;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread producerThread = new Thread(()->{
            try{
                Thread.sleep(3000l);
            }catch (Exception exception){

            }
            sharedResource.addItem();
        });
        Thread consumerThread = new Thread(()->{
            sharedResource.consumeItem();
        });
        producerThread.start();
        consumerThread.start();
    }
}
