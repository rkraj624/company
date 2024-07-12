package com.company.thread.ThreadPool;

import java.util.concurrent.ThreadFactory;

class CustomThreadFactor implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        return new Thread(r);
    }
}
