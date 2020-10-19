package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Sphynx extends Cat {
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public void mew(Person person) {
        person.takeHappiness(-20);
    }

    @Override
    public void purr(Person person) {
        person.takeHappiness(20);
    }
}
