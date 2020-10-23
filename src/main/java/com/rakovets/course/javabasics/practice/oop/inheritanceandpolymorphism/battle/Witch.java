package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battle;

public class Witch extends Enemy{

    public Witch(int health) {
        super(health);
    }

    public void setResurrection(Zombie zombie) {
        System.out.print(Color.RED + getClass().getSimpleName() + " resurrections zombie.   " + Color.RESET);
        zombie.setHealth(20);
        System.out.println(Color.CYAN + zombie.getClass().getSimpleName() + " health = " + zombie.getHealth() + Color.RESET);
    }
}
