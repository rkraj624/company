package com.company.thread.StampedLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.StampedLock;

public class SharedResource {
    /*
    * Optimistic Lock : version changed occurred after reading the current data
    * Stamped Lock has two functionality ReadWriteLock & OptimisticLock
    */
    private boolean isAvailable = true;
    private int a = 10;
    public void producer(StampedLock stampedLock){
        try{
            long stamped = stampedLock.tryOptimisticRead();
            System.out.println("Read Lock acquired by "+Thread.currentThread().getName());
            a = 11;
            Thread.sleep(8000);
            if(stampedLock.validate(stamped)){
                System.out.println("You can read the value successfully");
            }else{
                System.out.println("roll back ");
                a = 10;
            }
        }catch (Exception ex){

        }
    }
    public void consume(StampedLock stampedLock){
        long stamped = stampedLock.writeLock();
        try{
            isAvailable = false;
            System.out.println("Write Lock acquired by "+Thread.currentThread().getName());
            a = 9;

        }catch (Exception ex){
        }finally {
            stampedLock.unlockWrite(stamped);
            System.out.println("Write Lock released by "+Thread.currentThread().getName());
        }
    }

}
