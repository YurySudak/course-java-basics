package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Atm {
    private int numberBanknotes100;
    private int numberBanknotes50;
    private int numberBanknotes20;

    Atm(int numberBanknotes100, int numberBanknotes50, int numberBanknotes20) {
        this.numberBanknotes100 = numberBanknotes100;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes20 = numberBanknotes20;
    }

    void addBanknotes100(int number) {
        this.numberBanknotes100 += number;
    }
    void addBanknotes50(int number) {
        this.numberBanknotes50 += number;
    }
    void addBanknotes20(int number) {
        this.numberBanknotes20 += number;
    }

    boolean isPossibleIssue(int amount) {
        boolean result = false;
        for (int num100 = 0; num100 <= this.numberBanknotes100; num100++) {
            for (int num50 = 0; num50 <= this.numberBanknotes50; num50++) {
                for (int num20 = 0; num20 <= this.numberBanknotes20; num20++) {
                    if (num100 * 100 + num50 * 50 + num20 * 20 == amount) {
                        result = true;
                        break;
                    }
                }
            if (result) break;
            }
        if (result) break;
        }
    return result;
    }

    void getOptionsCombinationBanknotes(int amount) {
        this.amount = amount;
        if (this.isPossibleIssue(amount)) {
            System.out.println("options:");
            int option = 0;
            for (int num100 = 0; num100 <= this.numberBanknotes100; num100++) {
                for (int num50 = 0; num50 <= this.numberBanknotes50; num50++) {
                    for (int num20 = 0; num20 <= this.numberBanknotes20; num20++) {
                        String result = "";
                        if (num100 * 100 + num50 * 50 + num20 * 20 == amount) {
                            result = "option " + ++option + ": ";
                            if (num100 != 0) result += "banknote 100: " + num100 + "   ";
                            if (num50 != 0) result += "banknote 50: " + num50 + "   ";
                            if (num20 != 0) result += "banknote 20: " + num20;
                            System.out.println(result);
                        }
                    }
                }
            }
        }
        else System.out.println("sorry, we haven't banknotes for this amount");
    }

    void getCash(int clientOption) {
        int amount = this.amount;
        if (this.isPossibleIssue(amount)) {
            int option = 0;
            for (int num100 = 0; num100 <= this.numberBanknotes100; num100++) {
                for (int num50 = 0; num50 <= this.numberBanknotes50; num50++) {
                    for (int num20 = 0; num20 <= this.numberBanknotes20; num20++) {
                        if (num100 * 100 + num50 * 50 + num20 * 20 == amount) {
                            if (++option == clientOption) {
                                this.numberBanknotes100 -= num100;
                                this.numberBanknotes50 -= num50;
                                this.numberBanknotes20 -= num20;
                                System.out.println("take the money");
                            }
                        }
                    }
                }
            }
        }
        else System.out.println("sorry, we haven't banknotes for this amount");
    }

    private int amount = 0;

    void getBalance() {
        System.out.println("balance is:");
        System.out.println("banknote 100: " + this.numberBanknotes100 + "   banknote 50: " + this.numberBanknotes50 + "   banknote 20: " + this.numberBanknotes20);
    }
}
