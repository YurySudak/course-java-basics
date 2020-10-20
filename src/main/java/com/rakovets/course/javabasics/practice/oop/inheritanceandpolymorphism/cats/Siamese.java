package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats;

public class Siamese extends Cat {
    public Siamese(String name) {
        super(name);
    }

    @Override
    public void mew(Person person) {
        person.takeHappiness(-10);
    }

    @Override
    public void purr(Person person) {
        person.takeHappiness(10);
    }
}
