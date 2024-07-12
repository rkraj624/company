package com.company.thread.Condition;

import java.util.PriorityQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    private PriorityQueue<Integer> queue = new PriorityQueue<>(3);
    ReentrantLock reentrantLock = new ReentrantLock();
    Condition condition = reentrantLock.newCondition();

    public void produceItem(int item) {
        try {
            reentrantLock.lock();
            System.out.println("Producer lock acquired");
            while (queue.size() == 3) {
                System.out.println("Producer waiting ");
                condition.await();
            }
            queue.add(item);
            System.out.println("Item produced " + item);
            condition.signal();
        } catch (Exception ex) {

        }finally {
            reentrantLock.unlock();
            System.out.println("Producer lock released");
        }

    }

    public void consumeItem() {
        try {
            reentrantLock.lock();
            System.out.println("Consumer lock acquired");
            while (queue.isEmpty()) {
                System.out.println("Consumer waiting ");
                condition.await();
            }
            System.out.println("Item consumed " + queue.poll());
            condition.signal();
        } catch (Exception ex) {

        }finally {
            reentrantLock.unlock();
            System.out.println("Consumer lock released");
        }
    }
}
