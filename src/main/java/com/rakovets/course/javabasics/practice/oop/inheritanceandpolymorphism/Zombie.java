package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Zombie extends Enemy{

    public Zombie(int health) {
        super(health);
    }

    public void getResurrection() {
        if (!isAlive()) {
            setHealth(20);
        }
        System.out.println("Zombie health = " + getHealth());
    }

    public String getType() {
        return "Zombie";
    }
}
