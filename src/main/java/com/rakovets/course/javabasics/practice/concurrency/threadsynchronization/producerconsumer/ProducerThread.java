package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.producerconsumer;

public class ProducerThread extends Thread {
    private final Store store;

    public ProducerThread(Store store) {
        this.store = store;
    }

    public void run() {
        store.produce();
    }
}
