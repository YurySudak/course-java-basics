package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats;

public class Siamese extends Cat {
    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew(Person person) {
        person.changeHappiness(-10);
        return "mew!!!";
    }

    @Override
    public String purr(Person person) {
        person.changeHappiness(15);
        return "purr!!!";
    }
}
