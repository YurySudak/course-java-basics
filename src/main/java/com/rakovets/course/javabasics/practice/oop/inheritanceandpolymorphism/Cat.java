package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void mew(Person person) {
        person.takeHappiness(-5);
    }

    public void purr(Person person) {
        person.takeHappiness(5);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
