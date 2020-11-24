package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization;

import com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet.Factory;
import com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet.Wednesday;
import com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet.World;
import com.rakovets.course.javabasics.util.Color;

import java.util.Random;

public class SkyNet {
    public static void main(String[] args) {
        Factory factory = new Factory();
        World world = new World(factory);
        Wednesday wednesday = new Wednesday(factory);
        Thread factoryThread;
        Thread worldThread;
        Thread wednesdayThread;
        int days = 100;
        for (int i = 1; i <= days; i++) {
            System.out.println("Day " + i);
            factoryThread = new Thread(factory);
            factoryThread.start();
            try {
                factoryThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            worldThread = new Thread(world);
            wednesdayThread = new Thread(wednesday);
            if (new Random().nextInt(2) == 0) {
                worldThread.start();
                wednesdayThread.start();
            } else {
                wednesdayThread.start();
                worldThread.start();
            }
            try {
                    worldThread.join();
                    wednesdayThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n" + Color.MAGENTA + "Fraction Wednesday has " + wednesday.getRobot() + " robots.");
        System.out.println("Fraction World has " + world.getRobot() + " robots." + Color.RESET);
    }
}
