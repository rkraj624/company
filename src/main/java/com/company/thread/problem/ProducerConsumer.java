package com.company.thread.problem;


import java.util.PriorityQueue;

public class ProducerConsumer {
    private PriorityQueue<Integer> queue = new PriorityQueue<>(3);

    public synchronized void produceItem(int item) {
        try {
            while (queue.size() == 3) {
                System.out.println("waiting item to be consumed");
                wait();
            }
            queue.add(item);
            System.out.println("Item produced " + item);
            notify();
        } catch (Exception ex) {

        }

    }

    public synchronized void consumeItem() {
        try {
            while (queue.isEmpty()) {
                System.out.println("Waiting for the item to be produced");
                wait();
            }
            System.out.println("Item consumed " + queue.poll());
            notify();
        } catch (Exception ex) {

        }
    }
}
