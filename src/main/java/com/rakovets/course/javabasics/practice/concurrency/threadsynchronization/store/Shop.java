package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.store;

import com.rakovets.course.javabasics.util.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Shop {
    private final String[] products = {"bread", "butter", "milk", "meat", "fish", "eggs", "beer", "potato", "carrot", "tomato", "sugar", "salt"};
    private final Integer[] cashRegisters = {1, 2, 3};

    public void buy(Buyer buyer) {
        int numberOfCashRegister = new Random().nextInt(cashRegisters.length);
        synchronized (cashRegisters[numberOfCashRegister]) {
            System.out.println(Color.RED + "Cash register " + cashRegisters[numberOfCashRegister] + " starts to service " + buyer.getName() + Color.RESET);
            for(String product : buyer.getList()) {
                System.out.println(Color.BLUE + "Cash register " + cashRegisters[numberOfCashRegister] + " checkouts " + product + Color.RESET);
            }
        }
    }

    public List<String> getListOfProducts() {
        List<String> list = new ArrayList<>();
        int max = 10;
        int amountOfProducts = new Random().nextInt(max) + 1;
        for (int i = 0; i < amountOfProducts; i++) {
            int numberOfProduct = new Random().nextInt(products.length);
            list.add(products[numberOfProduct]);
        }
        return list;
    }
}
