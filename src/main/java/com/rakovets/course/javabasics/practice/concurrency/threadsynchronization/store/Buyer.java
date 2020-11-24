package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.store;

import java.util.List;

public class Buyer implements Runnable {
    private Shop shop;
    private List<String> list;
    private static int number;
    private String name;

    public Buyer(Shop shop) {
        this.shop = shop;
        list = shop.getListOfProducts();
        number++;
        name = "Buyer #" + number;
        printList();
    }

    private void printList() {
        System.out.print(name + " got to buy:");
        for(String product : list) {
            System.out.print(" " + product);
        }
        System.out.println();
    }

    @Override
    public void run() {
        shop.buy(this);
    }

    public List<String> getList() {
        return list;
    }

    public String getName() {
        return name;
    }
}
