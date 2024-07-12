package com.company.thread.MonitorLock;

public class Task {
    public synchronized void task1(){
        try {
            System.out.println("Executing task 1");
            Thread.sleep(5000);
            System.out.println("Task1 completed");
        }catch (Exception exception){

        }
    }
    public void task2(){
        System.out.println("Executing task 2");
        synchronized (this){
            System.out.println("task2 completed");
        }
    }
    public void task3(){
        System.out.println("task3 is executed successfully");
    }
}
