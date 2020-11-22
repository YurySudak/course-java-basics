package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization;

import com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.producerconsumer.ConsumerThread;
import com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.producerconsumer.ProducerThread;
import com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.producerconsumer.Store;

public class NumberStoreDemo {
    public static void main(String[] args) {
        Store store = new Store();
        ProducerThread producerThread = new ProducerThread(store);
        ConsumerThread consumerThread = new ConsumerThread(store);
        producerThread.start();
        consumerThread.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        producerThread.interrupt();
        consumerThread.interrupt();
    }
}
