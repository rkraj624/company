package com.company.thread.AtomicVariable;

import java.util.concurrent.atomic.AtomicInteger;

public class SharedResource {
    AtomicInteger atomicInteger = new AtomicInteger(0);
    int counter = 0;
    public void increment(){
        for(int i = 0; i< 400 ; i++)
            counter++;
//            atomicInteger.incrementAndGet();
    }
    public void printValue(){
        System.out.println("updated value is "+ counter +" for thread "+Thread.currentThread().getName());
    }
}
