package com.company.thread.threadlifecycle;

public class SharedResource {
    private boolean itemAvailable = false;
    public synchronized void addItem(){
        try{
            System.out.println("AddItem thread inside addItem method "+ Thread.currentThread().getName());
            itemAvailable = true;
            System.out.println("Item is Produced ");
            notifyAll();
        }catch (Exception exception){

        }
    }
    public synchronized void consumeItem(){
        System.out.println("Consumer thread inside consumerItem method");
        try{
            if(!itemAvailable){
                System.out.println("Waiting for item to ready for consuming.");
                wait();
            }
        }catch (Exception exception){

        }
        System.out.println("Consumer thread  consumed Item ");
        itemAvailable = false;
    }
}
