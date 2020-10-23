package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats;

public class Sphynx extends Cat {
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew(Person person) {
        person.changeHappiness(-20);
        return "meeeeew";
    }

    @Override
    public String purr(Person person) {
        person.changeHappiness(25);
        return "purrrrrrr";
    }
}
