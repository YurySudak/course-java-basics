package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battle;

public class Beast extends Enemy {

    public Beast(int health) {
        super(health);
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage * 0.8;
        if (health < 0) health = 0;
        if (health > 100) health = 100;
        if (isAlive())
            System.out.print(Color.RED + "Beast regenerates. " + Color.RESET);
    }
}
