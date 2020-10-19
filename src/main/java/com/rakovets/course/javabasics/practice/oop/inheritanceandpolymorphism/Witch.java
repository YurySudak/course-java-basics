package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Witch extends Enemy{

    public Witch(int health) {
        super(health);
    }

    public void setResurrection(Zombie zombie) {
        System.out.print("Witch resurractions zombie   ");
        zombie.getResurrection();
    }

    public String getType() {
        return "Witch";
    }
}
