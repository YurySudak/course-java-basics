package com.rakovets.course.javabasics.practice.concurrency;

public class MasterWorkerDemo {
    public static void main(String[] args) {
        MasterWorker master = new MasterWorker();
        master.start();
        while(master.getNum() != -1) {
            if (master.getNum() == 0)
                System.out.print("...");
            try {
                master.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
