package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.producerconsumer;

import java.util.Random;

public class ConsumerThread implements Runnable {
    private final Store store;

    public ConsumerThread(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(new Random().nextInt(10));
            } catch (InterruptedException e) {
                break;
            }
            store.consume();
        }
    }
}
