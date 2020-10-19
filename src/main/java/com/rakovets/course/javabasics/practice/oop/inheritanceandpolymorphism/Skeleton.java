package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Skeleton extends Enemy {
    public Skeleton(int health) {
        super(health);
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage / 2;
    }

    public String getType() {
        return "Skeleton";
    }
}
