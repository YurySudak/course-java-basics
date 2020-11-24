package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization;

import com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.producerconsumer.ConsumerThread;
import com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.producerconsumer.ProducerThread;
import com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.producerconsumer.Store;

public class NumberStoreDemo {
    public static void main(String[] args) {
        Store store = new Store();
        new Thread(new ProducerThread(store)).start();
        new Thread(new ConsumerThread(store)).start();
    }
}
