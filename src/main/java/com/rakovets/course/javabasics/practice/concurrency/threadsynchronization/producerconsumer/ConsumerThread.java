package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.producerconsumer;

public class ConsumerThread extends Thread {
    private final Store store;

    public ConsumerThread(Store store) {
        this.store = store;
    }

    public void run() {
        store.consume();
    }
}
