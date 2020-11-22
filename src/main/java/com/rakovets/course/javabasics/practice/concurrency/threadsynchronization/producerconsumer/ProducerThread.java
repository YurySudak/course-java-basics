package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.producerconsumer;

public class ProducerThread extends Thread {
    Store store;

    public ProducerThread(Store store) {
        this.store = store;
    }

    public void run() {
        store.produce();
    }
}
