package com.company.thread.AtomicVariable;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        new Thread(()->{
            try{
                sharedResource.increment();
                sharedResource.printValue();
            }catch (Exception ex){

            }
        }).start();
        new Thread(()->{
            try{
                sharedResource.increment();
                sharedResource.printValue();
            }catch (Exception ex){

            }
        }).start();
    }
}
