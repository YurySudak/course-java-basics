package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battle;

public class Skeleton extends Enemy {
    public Skeleton(int health) {
        super(health);
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage * 0.8;
    }

    public String getType() {
        return "Skeleton";
    }
}
