package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battle;

public class Enemy implements Mortal{

    protected int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
        if (health > 100) health = 100;
    }

    public void attackHero(Hero hero) {
        if (isAlive()) {
            int damage = 20;
            System.out.print(Color.PURPLE + getClass().getSimpleName() + " attacks " + hero.getClass().getSimpleName() + " " + hero.getName() + " and takes damage " + damage + ".   " + Color.RESET);
            hero.takeDamage(damage);
            if (hero.isAlive()) {
                System.out.println(Color.CYAN + hero.getName() + " health = " + hero.getHealth() + Color.RESET);
            } else System.out.println(hero.getClass().getSimpleName() + " is dead");
        }
    }

    @Override
    public boolean isAlive() {
        return (health > 0);
    }
}
