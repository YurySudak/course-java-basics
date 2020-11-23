package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization;

import com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet.Factory;
import com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet.Wednesday;
import com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet.World;

public class SkyNet {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Thread world = new World(factory);
        Thread wednesday = new Wednesday(factory);
        int days = 10;
        for (int i = 1; i <= days; i++) {
            System.out.println("Day " + i);
            Thread factoryThread = new Thread(factory);
            factoryThread.start();
            try {
                factoryThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            world = new Thread(world);
            wednesday = new Thread(wednesday);
            world.start();
            wednesday.start();
            try {
                world.join();
                wednesday.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
