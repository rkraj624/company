package com.company.thread.MonitorLock;

public class MonitorLockMain {
    /*
    * Monitor Lock make sure only 1 thread goes inside the particular section of code (a synchronized lock or method)
    * lock is on object level, not on thread level, every object has its own lock
    * */
    public static void main(String[] args) {
        Task task = new Task();
        Thread thread1 = new Thread(()-> task.task1());
        Thread thread2 = new Thread(()-> task.task2());
        Thread thread3 = new Thread(()-> task.task3());
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
