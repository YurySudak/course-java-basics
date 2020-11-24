package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.producerconsumer;

public class ProducerThread implements Runnable {
    private final Store store;

    public ProducerThread(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            store.produce();
        }
    }
}
