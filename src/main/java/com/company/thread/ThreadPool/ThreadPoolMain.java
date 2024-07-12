package com.company.thread.ThreadPool;

import java.util.concurrent.*;

public class ThreadPoolMain {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2,4,1, TimeUnit.HOURS,
                new ArrayBlockingQueue<>(2),new CustomThreadFactor(), new CustomRejectHandler());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        for (int i = 1; i <= 7; i++){
            threadPoolExecutor.execute(()->{
                try{
                    Thread.sleep(5000l);
                    System.out.println("Thread name : "+ Thread.currentThread().getName());
                }catch (Exception exception){

                }
            });
        }
        threadPoolExecutor.shutdown();
    }
}
