package com.rakovets.course.javabasics.practice.concurrency;

import java.util.ArrayDeque;
import java.util.Queue;

public class Worker extends Thread {

    private Queue<Integer> queue = new ArrayDeque<>();

    public void run() {
        int num;
        while(true) {
            if (!queue.isEmpty()) {
                num = queue.poll();
                try {
                    sleep(num * 1000);
                } catch (InterruptedException e) {
                    break;
                }
                System.out.println("I slept " + num + " seconds");
            } else {
                System.out.print("...");
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }
    }

    public Queue<Integer> getQueue() {
        return queue;
    }
}
