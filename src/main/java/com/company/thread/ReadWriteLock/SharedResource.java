package com.company.thread.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SharedResource {
    private boolean isAvailable = true;
    public void producer(ReadWriteLock readWriteLock){
        try{
            readWriteLock.readLock().lock();
            System.out.println("Lock acquired by "+Thread.currentThread().getName());
            Thread.sleep(4000);
        }catch (Exception ex){

        }finally {
            readWriteLock.readLock().unlock();
            System.out.println("Lock released by "+Thread.currentThread().getName());
        }
    }
    public void consume(ReadWriteLock readWriteLock){
        try{
            readWriteLock.writeLock().lock();
            isAvailable = false;
            System.out.println("Lock acquired by "+Thread.currentThread().getName());
            Thread.sleep(4000);
        }catch (Exception ex){
        }finally {
            readWriteLock.writeLock().unlock();
            System.out.println("Lock released by "+Thread.currentThread().getName());
        }
    }
}
