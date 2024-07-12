package com.company.thread.Semaphore;

import java.util.concurrent.Semaphore;


public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        SharedResource sharedResource = new SharedResource();
        new Thread(()->{
            try{
                sharedResource.producer(semaphore);
            }catch (Exception ex){

            }
        }).start();
        new Thread(()->{
            try{
                sharedResource.producer(semaphore);
            }catch (Exception ex){

            }
        }).start();

    }
}
