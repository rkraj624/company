package com.company.thread.Semaphore;

import java.util.concurrent.Semaphore;

public class SharedResource {
    private int a = 10;
    public void producer(Semaphore semaphore){
        try{
            semaphore.acquire();
            System.out.println("Lock acquired by "+Thread.currentThread().getName());
            Thread.sleep(4000);
            a = 11;

        }catch (Exception ex){

        }finally {
            semaphore.release();
            System.out.println("Lock released by "+Thread.currentThread().getName());
        }
    }
}
