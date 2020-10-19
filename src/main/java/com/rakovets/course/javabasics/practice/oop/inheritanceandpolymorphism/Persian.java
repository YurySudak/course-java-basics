package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }

    @Override
    public void mew(Person person) {
        person.takeHappiness(-15);
    }

    @Override
    public void purr(Person person) {
        person.takeHappiness(15);
    }
}
