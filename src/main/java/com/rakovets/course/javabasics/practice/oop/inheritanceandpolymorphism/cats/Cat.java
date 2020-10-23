package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String mew(Person person) {
        person.changeHappiness(-5);
        return "mew mew";
    }

    public String purr(Person person) {
        person.changeHappiness(10);
        return "purr purr";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
