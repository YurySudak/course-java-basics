package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew(Person person) {
        person.changeHappiness(-15);
        return "mew mew mew";
    }

    @Override
    public String purr(Person person) {
        person.changeHappiness(20);
        return "purr purr purr";
    }
}
