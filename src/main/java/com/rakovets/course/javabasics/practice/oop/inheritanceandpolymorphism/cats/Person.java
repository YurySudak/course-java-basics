package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats;

public class Person {
    private int happiness;

    public Person(int happiness) {
        this.happiness = happiness;
    }

    public void takeHappiness(int happiness) {
        this.happiness += happiness;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }
}
