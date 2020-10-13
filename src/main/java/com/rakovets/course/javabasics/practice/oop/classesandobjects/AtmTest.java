package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class AtmTest {
    public static void main(String[] args) {
        Atm atm = new Atm(10, 20,30);
        atm.getOptionsCombinationBanknotes(200);
        atm.getCash(5);
        atm.getBalance();
        atm.addBanknotes100(1);
        atm.addBanknotes50(2);
        atm.addBanknotes20(3);
        atm.getBalance();
    }
}
